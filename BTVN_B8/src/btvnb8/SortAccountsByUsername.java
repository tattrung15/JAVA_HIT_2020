package btvnb8;

import java.util.Comparator;

public class SortAccountsByUsername implements Comparator<Account> {
    @Override
    public int compare(Account o1, Account o2) {
        return o1.getUsername().compareTo(o2.getUsername());
    }
}
