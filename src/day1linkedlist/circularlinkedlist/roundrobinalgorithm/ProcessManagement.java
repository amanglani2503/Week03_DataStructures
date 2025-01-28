package day1linkedlist.circularlinkedlist.roundrobinalgorithm;

public class ProcessManagement {
    public static void main(String[] args) {
        ProcessQueue processQueue = new ProcessQueue();

        // Add processes
        processQueue.addProcess(1, 10, 2);
        processQueue.addProcess(2, 5, 1);
        processQueue.addProcess(3, 8, 3);

        // Display processes
        processQueue.displayProcesses();

        // Simulate round-robin scheduling with time quantum of 3
        int timeQuantum = 3;
        System.out.println("\nSimulating Round Robin Scheduling with Time Quantum = " + timeQuantum);
        processQueue.simulateRoundRobin(timeQuantum);

        // Display remaining processes
        processQueue.displayProcesses();
    }
}