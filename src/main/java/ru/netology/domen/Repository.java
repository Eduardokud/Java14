package ru.netology.domen;

import java.util.Arrays;

public class Repository {
    protected Ticket[] tickets = new Ticket[0];

    public void add(Ticket item) {
        Ticket[] tmp = new Ticket[tickets.length + 1];
        for (int i = 0; i < tickets.length; i++) {
            tmp[i] = tickets[i];
        }
        tmp[tmp.length - 1] = item;
        tickets = tmp;

    }

    public Ticket[] findAll() {
        Arrays.sort(tickets);
        return tickets;
    }

    public void remoteById(int id) {
        Ticket[] tmp = new Ticket[tickets.length - 1];
        int copyToIndex = 0;
        for (Ticket ticket : tickets) {
            if (ticket.getId() != id) {
                tmp[copyToIndex] = ticket;
                copyToIndex++;

            }


        }
        tickets = tmp;

    }


}
