package com.company;

import static java.lang.Integer.parseInt;
import static java.lang.Integer.valueOf;

public class tableau {
    public static void TriSSSCroissantEntier(int[] tab){
        int imin; //indice du plus petit

        for (int i=0; i<tab.length-1; i++){
            imin = i;

            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }

            if (imin != i)
                permuter(tab, i, imin);
        }
    }

    public static void TriSSSCroissantChaines(int[] tab){
        int imin; //indice du plus petit


        for (int i=0; i<tab.length-1; i++){
            imin = i;

            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }

            if (imin != i)
                permuter(tab, i, imin);
        }
    }

    public static void TriSSSDecroissantEntier(int[] tab){
        int imax; //indice du plus grand

        for (int i=0; i<tab.length-1; i++){
            imax = i;

            for (int j=i+1; j<tab.length; j++){
                if (tab[j] > tab[imax])
                    imax = j;
            }

            if (imax != i)
                permuter(tab, i, imax);
        }
    }

    public static int MaxEntier(int[] tab){
        int imax; //indice du plus grand

        for (int i=0; i<tab.length-1; i++){
            imax = i;

            for (int j=i+1; j<tab.length; j++){
                if (tab[j] > tab[imax])
                    imax = j;
            }

            if (imax != i)
                permuter(tab, i, imax);
        }
        return tab[0];
    }

    public static int MinEntier(int[] tab){
        int imin; //indice du plus grand

        for (int i=0; i<tab.length-1; i++){
            imin = i;

            for (int j=i+1; j<tab.length; j++){
                if (tab[j] < tab[imin])
                    imin = j;
            }

            if (imin != i)
                permuter(tab, i, imin);
        }
        return tab[0];
    }

    public static void permuter(int[] tab, int ind1, int ind2){
        int transit = tab[ind1]; //variable de transition
        tab[ind1] = tab[ind2];
        tab[ind2] = transit;
    }


    public static int sommeEntier(int[] tab){
        int somme = 0;
        for (int elem: tab)
            somme = somme + elem;
        return somme;
    }

    public static int moyenneEntier(int[] tab) {
        int somme = 0;
        int nb = 0;
        int moyenne = 0;
        for (int elem : tab){
            somme = somme + elem;
            nb++;
        }
        moyenne = somme / nb;
        return moyenne;
    }

    public static int FouilleSeq(int[] tab, int intCherche){
        int i = 0; // index de texte
        boolean trouve = false; // indicateur de recherche

        while (!trouve && i < tab.length){
            if (tab[i] == intCherche)
                trouve = true;
            else
                i++;
        }

        if (trouve)
            return i;
        else
            return -1;
    }
}
