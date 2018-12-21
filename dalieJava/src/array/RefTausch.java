package array;

class RefTausch{
    public static void main(String[] args){
        Pos[] feld = new Pos[2];
        Pos p1 = new Pos(1, 2);
        Pos p2 = new Pos(3, 4);
        feld[0] = p1;
        feld[1] = p2;
        TauschKlasse tk = new TauschKlasse();
        tk.tauschen(feld);
        System.out.println(p1.x + "   " + p1.y);
        
        
    }
}