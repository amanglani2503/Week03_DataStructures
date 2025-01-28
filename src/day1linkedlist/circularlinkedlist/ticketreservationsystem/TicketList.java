package day1linkedlist.circularlinkedlist.ticketreservationsystem;

public class TicketList {
    private TicketNode head;
    private TicketNode tail;
    private int totalTickets;

    public TicketList() {
        this.head = null;
        this.tail = null;
        this.totalTickets = 0;
    }

    // Add a new ticket reservation at the end
    public void addTicket(int ticketID, String customerName, String movieName, String seatNumber, String bookingTime) {
        TicketNode newNode = new TicketNode(ticketID, customerName, movieName, seatNumber, bookingTime);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // Point to itself (circular)
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        totalTickets++;
        System.out.println("Added ticket: " + ticketID);
    }

    // Remove a ticket by Ticket ID
    public void removeTicket(int ticketID) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = head;
        TicketNode previous = null;

        do {
            if (current.ticketID == ticketID) {
                if (current == head) { // If head is the ticket to remove
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) { // If tail is the ticket to remove
                    tail = previous;
                    tail.next = head;
                } else { // For tickets in the middle
                    previous.next = current.next;
                }
                totalTickets--;
                System.out.println("Removed ticket: " + ticketID);
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Ticket ID not found: " + ticketID);
    }

    // Display all tickets
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked yet.");
            return;
        }

        TicketNode current = head;
        System.out.println("Current Booked Tickets:");
        do {
            System.out.println("Ticket ID: " + current.ticketID +
                    ", Customer Name: " + current.customerName +
                    ", Movie Name: " + current.movieName +
                    ", Seat Number: " + current.seatNumber +
                    ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String query) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }

        TicketNode current = head;
        boolean found = false;

        System.out.println("Search Results for \"" + query + "\":");
        do {
            if (current.customerName.equalsIgnoreCase(query) || current.movieName.equalsIgnoreCase(query)) {
                System.out.println("Ticket ID: " + current.ticketID +
                        ", Customer Name: " + current.customerName +
                        ", Movie Name: " + current.movieName +
                        ", Seat Number: " + current.seatNumber +
                        ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);

        if (!found) {
            System.out.println("No tickets found for the query.");
        }
    }

    // Calculate the total number of booked tickets
    public int getTotalTickets() {
        return totalTickets;
    }
}
