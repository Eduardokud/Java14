package ru.netology.domen;

import static java.util.regex.Pattern.matches;

public class Manager {
    protected Repository repo;

    public Manager(Repository repo) {
        this.repo = repo;
    }

    public void add(Ticket ticket) {
        repo.add(ticket);
    }

    public Ticket[] findAll() {

        return repo.findAll();
    }


    public Ticket[] findAllFrom(String text1, String text2) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : repo.findAll()) {
            if (matches(ticket.getFrom(), text1)) {
                if (matches(ticket.getTo(), text2)) {

                    Ticket[] tmp = new Ticket[result.length + 1];
                    for (int i = 0; i < result.length; i++) {
                        tmp[i] = result[i];
                    }
                    tmp[tmp.length - 1] = ticket;
                    result = tmp;
                }
            }
        }
        return result;

    }

}
