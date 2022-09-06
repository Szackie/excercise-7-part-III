# excercise-7-part-III
Basic OOP excercise

Zad. Czas

Napisać klasę Czas służącą do zapamiętania okresu czasu tj. liczby godzin i minut.
Klasa ta powinna mieć dwa pola prywatne:
• int godz;
• int minuty;
oraz metody publiczne:
• konstruktor z parametrami będącymi liczbą godzin i minut,
• konstruktor przyjmujący jako parametr łańcuch znaków na podstawie którego
można ustalić wartość godzin i minut np. ”12 h 58 min”
• String toString() której wynikiem jest łańcuch znaków opisujący dany okres
czasu, np. ”29 h 19 min”
• Czas dodaj(Czas t) której wynikiem jest nowy obiekt klasy Czas będący sumą
bieżącego i podanego jako parametr obiektu
• Czas odejmij(Czas t) analogicznie jak dodaj, tyle że odejmowanie,
• Czas pomnoz(int ile) wynikiem ma być okres czasu pomnożony podaną liczbę
razy,
• static Czas sumuj(Czas [] tab, int n) statyczna metoda klasy służąca do
sumowania wszystkich okresów czasu podanych w tablicy będącej pierwszym parametrem

Przykładowy program:

Czas t1(10, 56);
Czas t2(0, 123);
System.out.println("t1 = " + t1);
System.out.println("t2 = " + t2);
System.out.println("t1 + t2 = " + t1.dodaj(t2));
System.out.println("t1 - t2 = " + t1.odejmij(t2);
Czas [] tab = { t1, t2, t2 };
System.out.println("Czas.sumuj dla t1 + t2 + t2 = " +
Czas.sumuj(tab, 3));
23
System.out.println("t1 * 2 = " + t1.pomnoz(2));
Czas t3("3 h 17 min");
System.out.println("Konstruktor z łańcuchem: " + t3);

Wydruk dla przykładowego programu:

t1 = 10 h 56 min
t2 = 2 h 3 min
t1 + t2 = 12 h 59 min
t1 - t2 = 8 h 53 min
Czas.sumuj dla t1 + t2 + t2 = 15 h 2 min
t1 * 2 = 21 h 52 min
Konstruktor z łańcuchem: 3 h 17 min
