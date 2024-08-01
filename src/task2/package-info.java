package task2;
/**
 * Creați un pachet task2 (sau alt nume pe care îl doriți să îl folosiți). În el creați clasele:
 *
 * Student cu proprietățile: name (String), grade (double)
 * Internship
 * cu proprietățile: name (String), minGrade (String), students (array de clase Student - exemplu arrays).
 * cu metoda: chooseCandidateRandomly care returneaza in mod aleatoriu un student din lista de studenti corespunzatoare unui internship (Hint: folositi clasa Random).
 * cu metoda: chooseCandidatesForInterview care va afisa toti candidatii care au obtinut un phone interview la o anumita companie. Fiecare companie are asociat un grade minim dupa care va selecta candidatii pentru un phone interview. Astfel, daca grade-ul unui candidat este mai mare sau egal cu grade-ul minim dorit de o companie pentru angajatii sai, atunci acesta va primi un phone interview. Afisarea candidatilor se va face sub forma: “Candidate [nume_student] got a phone interview at [nume_internship]”
 * Nu folosiți vreun modificator de acces pentru variabile (aka “nu puneți nimic în fața lor în afară de tip”)
 * JobMarket cu metoda main.
 * Creati studentii cu numele Gigel, Dorel, Marcel si Ionel.
 * Creati internship-uri cu numele Google, Amazon, Facebook, Microsoft.
 * Apelati metoda chooseCandidatesForInterview(), pe rand, pentru fiecare companie din cele enumerate mai sus, respectand ordinea lor.
 * Opțional, în loc de arrays pentru campul students puteți să folosiți și obiecte de tip List, e.g. ArrayList (exemplu)
 **/