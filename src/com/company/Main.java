package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] tab = {1, -2, 240, 130, -253, 11, 99, 80, 3, -7};
        int[] tab2 = {1, -2, 240, 130, -253, 11, 99, 80, 3, -7};
        String[] tab3 = {"1", "-2", "240", "130", "-253", "11", "99", "80", "3", "-7"};
        int[] tab4 = {1, -2, 240, 130, -253, 11, 99, 80, 3, -7};
        int[] tab5 = {1, -2, 240, 130, -253, 11, 99, 80, 3, -7};
        int[] tab6 = {1, -2, 240, 130, -253, 11, 99, 80, 3, -7};
        int[] tab7 = {1, -2, 240, 130, -253, 11, 99, 80, 3, -7};
        int[] tab8 = {1, -2, 240, 130, -253, 11, 99, 80, 3, -7};
        int[] tab9 = {1, -2, 240, 130, -253, 11, 99, 80, 3, -7};
        int[] tab10 = {1, -2, 240, 130, -253, 11, 99, 80, 3, -7};
        int moyenne = 0;

        // TriCroissantSSS entier
        tableau.TriSSSCroissantEntier(tab);
        System.out.println(Arrays.toString(tab));

        // TriCroissantSSS chaines
        //tableau.TriSSSCroissantChaines(tab3);
        //System.out.println(Arrays.toString(tab3));

        // TriDecroissantSSS entier
        tableau.TriSSSDecroissantEntier(tab2);
        System.out.println(Arrays.toString(tab2));

        // TriDecroissantSSS chaines


        // max entier
        System.out.println(tableau.MaxEntier(tab7));

        // max chaines


        // min entier
        System.out.println(tableau.MinEntier(tab8));

        // min chaines


        // somme eniter
        System.out.println(tableau.sommeEntier(tab4));

        // somme chaines


        // moyenne entier
        System.out.println(tableau.moyenneEntier(tab5));

        // moyenne chaines


        // fouilleSeq entier
        System.out.println(tableau.FouilleSeq(tab6, 3));

        // fouilleSeq chaines
    }
}
