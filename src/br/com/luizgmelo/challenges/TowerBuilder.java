package br.com.luizgmelo.challenges;

import java.util.Arrays;

public class TowerBuilder {
    public static void main(String[] args) {
        String[] tower = Solution.towerBuilder(6);
        System.out.println(Arrays.toString(tower));
        for (String floor : tower) {
            System.out.println(floor);
        }
    }
}

class Solution
{
    public static String[] towerBuilder(int nFloors)
    {
        String[] tower = new String[nFloors];
        int nSpaces = nFloors * 2 - 1;

        if (nFloors < 1) {
            return tower;
        }

        Arrays.fill(tower, " ".repeat(nSpaces));

        StringBuilder firstFloor = new StringBuilder(tower[0]);
        firstFloor.setCharAt(nSpaces / 2, '*');

        tower[0] = firstFloor.toString();

        int left = nSpaces / 2 - 1;
        int right = nSpaces / 2 + 1;

        for (int i = 1; i < nFloors; i++) {
            StringBuilder pastFloor = new StringBuilder(tower[i - 1]);
            pastFloor.setCharAt(left, '*');
            pastFloor.setCharAt(right, '*');
            tower[i] = pastFloor.toString();
            left--;
            right++;
        }

        return tower;
    }
}
