class Czas {
    private int godz;
    private int minuty;

    public Czas(int godz, int minuty) {
        this.godz = godz + minuty / 60;
        this.minuty = minuty % 60;
    }

    public Czas(String text) {
        StringBuilder tempGodz = new StringBuilder();
        StringBuilder tempMinuty = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {

            while (i < text.length() && Character.isDigit(text.charAt(i))) {
                tempGodz.append(text.charAt(i));
                i++;
            }
            i++;
            while (i < text.length() && Character.isDigit(text.charAt(i))) {
                tempMinuty.append(text.charAt(i));
                i++;
            }
        }
        this.godz = Integer.parseInt(String.valueOf(tempGodz)) + Integer.parseInt(String.valueOf(tempMinuty)) / 60;
        this.minuty = Integer.parseInt(String.valueOf(tempMinuty)) % 60;
    }

    public String toString() {
        return this.godz + " h " + this.minuty + " min.";
    }

    public Czas dodaj(Czas t) {
        return new Czas(this.godz + t.godz + (t.minuty + this.minuty) / 60, (this.minuty + t.minuty) % 60);
    }

    public Czas odejmij(Czas t) {
        int tempMinuty = this.minuty - t.minuty;
        if (tempMinuty < 0) {
            tempMinuty = 60 - tempMinuty;
            this.godz--;
        }
        return new Czas(this.godz - t.godz, tempMinuty);
    }

    public Czas pomnoz(int ile) {
        return new Czas(this.godz * ile + this.minuty * ile / 60, this.minuty * ile % 60);
    }

    public static Czas sumuj(Czas[] tab, int n) {
        Czas sumaCzas = new Czas(0, 0);

        for (int i = 0; i < n; i++) {
            sumaCzas = sumaCzas.dodaj(tab[i]);
        }
        return sumaCzas;

    }

    public static void main(String[] args) {
        Czas t1 = new Czas(10, 56);
        Czas t2 = new Czas(0, 123);
        System.out.println("t1 = " + t1);
        System.out.println("t2 = " + t2);
        System.out.println("t1 + t2 = " + t1.dodaj(t2));
        System.out.println("t1 - t2 = " + t1.odejmij(t2));
        Czas[] tab = {t1, t2, t2};
        System.out.println("Czas.sumuj dla t1 + t2 + t2 = " +
                Czas.sumuj(tab, 3));

        System.out.println("t1 * 2 = " + t1.pomnoz(2));
        Czas t3 = new Czas("3 h 17 min");
        System.out.println("Konstruktor z łańcuchem: " + t3);
    }
}