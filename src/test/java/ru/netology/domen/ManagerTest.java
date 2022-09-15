package ru.netology.domen;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerTest {
    @Test
    public void compareTest() {
        Ticket ticket1 = new Ticket(1, 1400, "DME", "KZN", 50);
        Ticket ticket2 = new Ticket(3, 3000, "DME", "LED", 40);
        Ticket ticket3 = new Ticket(2, 1000, "DME", "EGO", 30);
        Ticket ticket4 = new Ticket(5, 1800, "LED", "DME", 35);
        Ticket ticket5 = new Ticket(4, 2500, "KZN", "LED", 55);
        Ticket ticket6 = new Ticket(12, 1200, "DME", "KZN", 50);
        Repository repo = new Repository();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        Ticket[] actual = repo.findAll();
        Ticket[] expected = {ticket3, ticket6, ticket1, ticket4, ticket5, ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void twoTry() {
        Ticket ticket1 = new Ticket(1, 1400, "DME", "KZN", 50);
        Ticket ticket2 = new Ticket(3, 3000, "DME", "LED", 40);
        Ticket ticket3 = new Ticket(2, 1000, "DME", "EGO", 30);
        Ticket ticket4 = new Ticket(5, 1800, "LED", "DME", 35);
        Ticket ticket5 = new Ticket(4, 2500, "KZN", "LED", 55);
        Ticket ticket6 = new Ticket(12, 1200, "DME", "KZN", 50);
        Repository repo = new Repository();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        Manager manager = new Manager(repo);
        Ticket[] actual = manager.findAllFrom("DME", "KZN");
        Ticket[] expected = {ticket6, ticket1};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void noFound() {
        Ticket ticket1 = new Ticket(1, 1400, "DME", "KZN", 50);
        Ticket ticket2 = new Ticket(3, 3000, "DME", "LED", 40);
        Ticket ticket3 = new Ticket(2, 1000, "DME", "EGO", 30);
        Ticket ticket4 = new Ticket(5, 1800, "LED", "DME", 35);
        Ticket ticket5 = new Ticket(4, 2500, "KZN", "LED", 55);
        Ticket ticket6 = new Ticket(12, 1200, "DME", "KZN", 50);
        Repository repo = new Repository();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        Manager manager = new Manager(repo);
        Ticket[] actual = manager.findAllFrom("DDD", "AAA");
        Ticket[] expected = {};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void oneTry() {
        Ticket ticket1 = new Ticket(1, 1400, "DME", "KZN", 50);
        Ticket ticket2 = new Ticket(3, 3000, "DME", "LED", 40);
        Ticket ticket3 = new Ticket(2, 1000, "DME", "EGO", 30);
        Ticket ticket4 = new Ticket(5, 1800, "LED", "DME", 35);
        Ticket ticket5 = new Ticket(4, 2500, "KZN", "LED", 55);
        Ticket ticket6 = new Ticket(12, 1200, "DME", "KZN", 50);
        Repository repo = new Repository();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        Manager manager = new Manager(repo);
        Ticket[] actual = manager.findAllFrom("DME", "LED");
        Ticket[] expected = {ticket2};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void twoEquals() {
        Ticket ticket1 = new Ticket(1, 1400, "DME", "KZN", 50);
        Ticket ticket2 = new Ticket(3, 3000, "DME", "LED", 40);
        Ticket ticket3 = new Ticket(2, 1000, "DME", "EGO", 30);
        Ticket ticket4 = new Ticket(5, 1800, "LED", "DME", 35);
        Ticket ticket5 = new Ticket(4, 2500, "KZN", "LED", 55);
        Ticket ticket6 = new Ticket(12, 1200, "DME", "KZN", 50);
        Ticket ticket7 = new Ticket(17, 1200, "DME", "KZN", 50);
        Repository repo = new Repository();
        repo.add(ticket1);
        repo.add(ticket2);
        repo.add(ticket3);
        repo.add(ticket4);
        repo.add(ticket5);
        repo.add(ticket6);
        repo.add(ticket7);
        Manager manager = new Manager(repo);
        Ticket[] actual = manager.findAllFrom("DME", "KZN");
        Ticket[] expected = {ticket6, ticket7, ticket1};
        Assertions.assertArrayEquals(expected, actual);

    }


}
