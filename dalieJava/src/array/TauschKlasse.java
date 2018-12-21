package array;

class TauschKlasse{
    
    void tauschen(Pos[] feld){
        for (int i = 0; i < feld.length; i++){
            int hilf;
            hilf = feld[i].x;
            feld[i].x = feld[i].y;
            feld[i].y = hilf;
        }
    }
}
