    public double W; - не потрібно
    public double H; - не потрібно
    private static double imb; - не потрібно
    public humanIMB(double w, double h) { - не потрібно
        W = w;
        H = h;
        imb = W / (H * H);
    }
    public double takeW() { - не потрібно
        return W;
    }
    public void putW(double w) { - не потрібно
        W = w;
        imb = W / (H * H);
    }
    public double takeH() { - не потрібно
        return H;
    }
    public void putH(double h) { - не потрібно
        H = h;
        imb = W / (H * H);
    }
    public static double takeImt() { - не потрібно
        return imb;
    }
    
![image](https://github.com/murranik/untitled11-master/assets/60602487/d04be114-b2af-4dd1-a8ff-5a2a674dd51f)
так як метод статичний ініціалізовувати клас немає сенсу


![image](https://github.com/murranik/untitled11-master/assets/60602487/a8f72806-5f4c-463f-a8a3-0725885b58b8) 
![image](https://github.com/murranik/untitled11-master/assets/60602487/aff83e94-bdc1-48f1-a0aa-5e5519398fa3)

зменшено кількість перевірок

не було else'ів через що виконувались би всі перевіркі

використав return так як такий код легше читати 
