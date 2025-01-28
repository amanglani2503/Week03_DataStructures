package day1linkedlist.circularlinkedlist.ticketreservationsystem;

public class TicketReservationSystem {
    public static void main(String[] args) {
        TicketList ticketList = new TicketList();

        // Adding tickets
        ticketList.addTicket(1, "John Doe", "Avatar 2", "A10", "5:00 PM");
        ticketList.addTicket(2, "Jane Smith", "Spider-Man", "B5", "6:00 PM");
        ticketList.addTicket(3, "Alice Johnson", "The Batman", "C3", "7:00 PM");

        // Displaying all tickets
        ticketList.displayTickets();

        // Searching for a ticket
        ticketList.searchTicket("Jane Smith");

        // Search for a ticket by movie name
        ticketList.searchTicket("Avatar 2");

        // Removing a ticket
        ticketList.removeTicket(2);

        // Displaying all tickets after removal
        ticketList.displayTickets();

        // Retrieving the total number of tickets
        System.out.println("Total Tickets Booked: " + ticketList.getTotalTickets());
    }
}
