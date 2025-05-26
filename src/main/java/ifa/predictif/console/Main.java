package ifa.predictif.console;

import ifa.predictif.dao.JpaUtil;

public class Main {
    public static void main(String[] args) {
        JpaUtil.creerFabriquePersistance();
        JpaUtil.fermerFabriquePersistance();
    }
}
