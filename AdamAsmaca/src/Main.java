import java.util.*;

public class Main {

    public static void main(String[] args) {
        AdamAsmaca.kelimeEkle("masum");
        AdamAsmaca.kelimeEkle("insan");
        AdamAsmaca.kelimeEkle("buruk");
        AdamAsmaca.kelimeEkle("mukaddes");
        AdamAsmaca adamAsmaca=new AdamAsmaca();

    }
}
class AdamAsmaca {
    private static ArrayList<String> kelimeler = new ArrayList<>();
    private int hataliTahmin = 0;
    private ArrayList<Character> harfler = new ArrayList<>();
    private String word;
    private StringBuilder tahminCizgileri;
    private HashSet<Character> kullanilmisHarfler=new HashSet<>();
    private HashSet<String> oyuncular=new HashSet<>();
    private int score=0;
    public AdamAsmaca() {
        System.out.println(ConsoleColors.BLACK + "*** Adam Asmaca Oyununa Hoşgeldin ***" + ConsoleColors.RESET);
        kelimeOlustur();
        arayuz();
        randomKelimeSec();
        tahminAl();
    }

    private void arayuz() {
        System.out.println(ConsoleColors.RED + "              /|");
        System.out.println("             / |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("               |");
        System.out.println("             __|__" + ConsoleColors.RESET);
    }

    private void kelimeOlustur() {
        kelimeler.add("ELMA");
        kelimeler.add("ARMUT");
        kelimeler.add("ARABA");
        kelimeler.add("KARGO");
        kelimeler.add("TELEVIZYON");
        kelimeler.add("TARIFE");
        kelimeler.add("KARNIYARIK");
        kelimeler.add("KALITE");
    }

    public static void kelimeEkle(String yeniKelime) {
        yeniKelime = yeniKelime.toUpperCase(Locale.ROOT);
        if (yeniKelime.length() > 1)
            kelimeler.add(yeniKelime);
    }

    private void randomKelimeSec() {
        word = kelimeler.get((int) (Math.random() * kelimeler.size()));
        tahminCizgileri = new StringBuilder("");
        for (int i = 0; i < word.length(); i++) {
            tahminCizgileri.append("_");
        }
        for (int i = 0; i < tahminCizgileri.length(); i++) {
            System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
        }
    }

    private void tahminAl() {
        int harfSirasi;
        Scanner input = new Scanner(System.in);
        while (hataliTahmin < 6 && tahminCizgileri.indexOf("_") != -1) {

            String tahmin = input.next();
            tahmin = tahmin.toUpperCase(Locale.ROOT);
            if (tahmin.length() == 1) {
                if (word.contains(tahmin)) {
                    for (int i = 0; i < word.length(); i++) {
                        if (word.charAt(i) == tahmin.charAt(0))
                            tahminCizgileri.setCharAt(i, word.charAt(i));

                    }

                    for (int i = 0; i < tahminCizgileri.length(); i++) {
                        System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                    }
                    System.out.println();
                    if (!kullanilmisHarfler.isEmpty())
                    System.out.println("Kullandığınız Harfler:"+Arrays.toString(kullanilmisHarfler.toArray()));
                } else {
                    if(!kullanilmisHarfler.contains(tahmin.charAt(0))){
                        hataliTahmin++;
                        kullanilmisHarfler.add(tahmin.charAt(0));
                    }
                    switch (hataliTahmin) {
                        case 1:
                            System.out.println("              /|");
                            System.out.println("             / |");
                            System.out.println("            O  |");
                            System.out.println("               |");
                            System.out.println("               |");
                            System.out.println("             __|__");

                            for (int i = 0; i < tahminCizgileri.length(); i++) {
                                System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                            }
                            System.out.println();
                            System.out.println("Kullandığınız Harfler:"+Arrays.toString(kullanilmisHarfler.toArray()));
                            break;
                        case 2:
                            System.out.println("              /|");
                            System.out.println("             / |");
                            System.out.println("            O  |");
                            System.out.println("            |  |");
                            System.out.println("               |");
                            System.out.println("             __|__");

                            for (int i = 0; i < tahminCizgileri.length(); i++) {
                                System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                            }
                            System.out.println();
                            System.out.println("Kullandığınız Harfler:"+Arrays.toString(kullanilmisHarfler.toArray()));
                            break;
                        case 3:
                            System.out.println("              /|");
                            System.out.println("             / |");
                            System.out.println("            O  |");
                            System.out.println("           /|  |");
                            System.out.println("               |");
                            System.out.println("             __|__");

                            for (int i = 0; i < tahminCizgileri.length(); i++) {
                                System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                            }
                            System.out.println();
                            System.out.println("Kullandığınız Harfler:"+Arrays.toString(kullanilmisHarfler.toArray()));
                            break;
                        case 4:
                            System.out.println("              /|");
                            System.out.println("             / |");
                            System.out.println("            O  |");
                            System.out.println("           /|\\ |");
                            System.out.println("               |");
                            System.out.println("             __|__");

                            for (int i = 0; i < tahminCizgileri.length(); i++) {
                                System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                            }
                            System.out.println();
                            System.out.println("Kullandığınız Harfler:"+Arrays.toString(kullanilmisHarfler.toArray()));
                            break;
                        case 5:
                            System.out.println("              /|");
                            System.out.println("             / |");
                            System.out.println("            O  |");
                            System.out.println("           /|\\ |");
                            System.out.println("           /   |");
                            System.out.println("             __|__");

                            for (int i = 0; i < tahminCizgileri.length(); i++) {
                                System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                            }
                            System.out.println();
                            System.out.println("Kullandığınız Harfler:"+Arrays.toString(kullanilmisHarfler.toArray()));
                            break;
                        case 6:
                            System.out.println("              /|");
                            System.out.println("             / |");
                            System.out.println("            O  |");
                            System.out.println("           /|\\ |");
                            System.out.println("           / \\ |");
                            System.out.println("             __|__");

                            for (int i = 0; i < tahminCizgileri.length(); i++) {
                                System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                            }
                            System.out.println();
                            System.out.println("Kaybettiniz kelime "+word+" idi.");
                            break;
                    }
                }
            } else if (Objects.equals(word, tahmin)) {
                tahminCizgileri.replace(0, tahminCizgileri.length(), tahmin);
                for (int i = 0; i < tahminCizgileri.length(); i++) {
                    System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                }
                System.out.println();
                score++;
                System.out.println("DOĞRU TAHMİN!");
                System.out.println((score+1)+". Soru");
                kelimeOlustur();
                arayuz();
                randomKelimeSec();
                tahminAl();
            }
            else
                if (tahmin.length()==word.length()){
                hataliTahmin++;
            switch (hataliTahmin) {
                case 1:
                    System.out.println("              /|");
                    System.out.println("             / |");
                    System.out.println("            O  |");
                    System.out.println("               |");
                    System.out.println("               |");
                    System.out.println("             __|__");

                    for (int i = 0; i < tahminCizgileri.length(); i++) {
                        System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                    }
                    break;
                case 2:
                    System.out.println("              /|");
                    System.out.println("             / |");
                    System.out.println("            O  |");
                    System.out.println("            |  |");
                    System.out.println("               |");
                    System.out.println("             __|__");

                    for (int i = 0; i < tahminCizgileri.length(); i++) {
                        System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                    }
                    break;
                case 3:
                    System.out.println("              /|");
                    System.out.println("             / |");
                    System.out.println("            O  |");
                    System.out.println("           /|  |");
                    System.out.println("               |");
                    System.out.println("             __|__");

                    for (int i = 0; i < tahminCizgileri.length(); i++) {
                        System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                    }
                    break;
                case 4:
                    System.out.println("              /|");
                    System.out.println("             / |");
                    System.out.println("            O  |");
                    System.out.println("           /|\\ |");
                    System.out.println("               |");
                    System.out.println("             __|__");

                    for (int i = 0; i < tahminCizgileri.length(); i++) {
                        System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                    }
                    break;
                case 5:
                    System.out.println("              /|");
                    System.out.println("             / |");
                    System.out.println("            O  |");
                    System.out.println("           /|\\ |");
                    System.out.println("           /   |");
                    System.out.println("             __|__");

                    for (int i = 0; i < tahminCizgileri.length(); i++) {
                        System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                    }
                    break;
                case 6:
                    System.out.println("              /|");
                    System.out.println("             / |");
                    System.out.println("            O  |");
                    System.out.println("           /|\\ |");
                    System.out.println("           / \\ |");
                    System.out.println("             __|__");

                    for (int i = 0; i < tahminCizgileri.length(); i++) {
                        System.out.print(ConsoleColors.YELLOW + tahminCizgileri.charAt(i) + " ");
                    }
                    System.out.println();
                    System.out.println("Kaybettiniz kelime "+word+" idi.");
                    break;
            }}
                else
                    System.out.println("Tahmininizin uzunluğu eşleşmedi!");
            }
        }
        public void scoreBoard(){

        }
    }

