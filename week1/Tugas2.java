package week1;

class Tugas2{
    static float Pi = 3.14f;
    public static void main(String[] args){
        System.out.println("Luas Persegi: " + lpersegi(3));
        System.out.println("Keliling Persegi: " + kpersegi(3));
        System.out.println("Luas Segitigas: " + lsegitiga(3, 5));
        System.out.println("Keliling Segitiga: " + ksegitiga(3, 3, 3));
        System.out.println("Luas Lingkaran: " + llingkaran(7));
        System.out.println("Keliling Lingkaran: " + klingkaran(7));
        System.out.println("Luas Kubus: " + lkubus(5));
        System.out.println("Keliling Kubus: " + kkubus(5));
    }

    public static float lpersegi(float s){
        return s * s;
    }

    public static float kpersegi(float s){
        return 4 * s;
    }

    public static float lsegitiga(float a, float t){
        return a * t / 2;
    }

    public static float ksegitiga(float a, float b, float c){
        return a + b + c;
    }
    public static float llingkaran(float r){
        return Pi * r * r;
    }

    public static float klingkaran(float r){
        return 2 * Pi * r;
    }

    public static float lkubus(float s){
        return 6 * s * s;
    }

    public static float kkubus(float s){
        return 12 * s;
    }
}