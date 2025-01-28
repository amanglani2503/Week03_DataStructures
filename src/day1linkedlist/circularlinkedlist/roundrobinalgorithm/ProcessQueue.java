package day1linkedlist.circularlinkedlist.roundrobinalgorithm;

public class ProcessQueue {
    private ProcessNode tail;
    private int processCount = 0;

    // Add a new process at the end
    public void addProcess(int processId, int burstTime, int priority) {
        ProcessNode newNode = new ProcessNode(processId, burstTime, priority);
        if (tail == null) {
            tail = newNode;
            tail.next = newNode; // Circular reference
        } else {
            newNode.next = tail.next;
            tail.next = newNode;
            tail = newNode;
        }
        processCount++;
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (tail == null) {
            System.out.println("No processes to remove.");
            return;
        }

        ProcessNode current = tail.next;
        ProcessNode prev = tail;
        do {
            if (current.processId == processId) {
                if (current == tail && current == tail.next) { // Only one process
                    tail = null;
                } else {
                    prev.next = current.next;
                    if (current == tail) { // Remove the tail
                        tail = prev;
                    }
                }
                processCount--;
                System.out.println("Process with ID " + processId + " removed.");
                return;
            }
            prev = current;
            current = current.next;
        } while (current != tail.next);

        System.out.println("Process with ID " + processId + " not found.");
    }

    // Simulate round-robin scheduling
    public void simulateRoundRobin(int timeQuantum) {
        if (tail == null) {
            System.out.println("No processes to execute.");
            return;
        }

        ProcessNode current = tail.next;
        int totalTime = 0;
        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;
        int initialProcessCount = processCount; // Store the initial number of processes

        while (processCount > 0) {
            if (current.burstTime > 0) {
                int executionTime = Math.min(current.burstTime, timeQuantum);
                current.burstTime -= executionTime;
                totalTime += executionTime;

                if (current.burstTime == 0) {
                    totalTurnaroundTime += totalTime;
                    totalWaitingTime += (totalTime - executionTime);
                    System.out.println("Process " + current.processId + " executed completely.");
                    ProcessNode temp = current;
                    current = current.next;
                    removeProcess(temp.processId);
                    continue;
                }
            }

            current = current.next;
        }

        // Calculate averages using the initial process count
        double averageWaitingTime = (double) totalWaitingTime / initialProcessCount;
        double averageTurnaroundTime = (double) totalTurnaroundTime / initialProcessCount;

        System.out.println("Average Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
    }


    // Display the circular list of processes
    public void displayProcesses() {
        if (tail == null) {
            System.out.println("No processes in the queue.");
            return;
        }

        ProcessNode current = tail.next;
        System.out.println("Processes in the queue:");
        do {
            System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != tail.next);
    }
}