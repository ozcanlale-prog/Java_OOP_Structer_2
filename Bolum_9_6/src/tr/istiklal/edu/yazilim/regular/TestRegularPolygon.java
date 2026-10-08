package tr.istiklal.edu.yazilim.regular;

public class TestRegularPolygon {

    public static void main(String[] args){
        
        RegularPolygon p1 = new RegularPolygon();                  // No-arg
        RegularPolygon p2 = new RegularPolygon(6, 4.0);            // (6, 4.0)
        RegularPolygon p3 = new RegularPolygon(10, 4.0, 5.6, 7.8); // (10, 4.0, 5.6, 7.8)
        
        // 1. Poligon Bilgileri
        System.out.println("--- 1. Poligon (Parametresiz) ---");
        System.out.println("Kenar Sayısı: " + p1.getN(1));
        System.out.println("Kenar Uzunluğu: " + p1.getSide(1)); // p1.getS() DEĞİL, getSide() olmalı!
        System.out.println("Merkez Koordinat: (" + p1.getX(0) + ", " + p1.getY(0) + ")");
        System.out.println("Çevre: " + p1.getPerimeter());
        System.out.println("Alan: " + p1.getArea());
        
        // 2. Poligon Bilgileri
        System.out.println("\n---" + "2. Poligon (6 Kenar, 4.0 Uzunluk) ---");
        System.out.println("Çevre: " + p2.getPerimeter());
        System.out.println("Alan: " + p2.getArea());
        
        // 3. Poligon Bilgileri
        System.out.println("\n--- 3. Poligon (10 Kenar, 4.0 Uzunluk, Koordinatlı) ---");
        System.out.println("Merkez Koordinat: (" + p3.getX(0) + ", " + p3.getY(1) + ")");
        System.out.println("Çevre: " + p3.getPerimeter());
        System.out.println("Alan: " + p3.getArea());
    }

    private static void Poligon(int i) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}