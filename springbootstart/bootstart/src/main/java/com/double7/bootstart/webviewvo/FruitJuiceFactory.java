package com.double7.bootstart.webviewvo;

public abstract class FruitJuiceFactory {

    public Juice createFruit(int type){
        switch (type){
            case 1:{
                return new AppleJuice() ;
            }
            case 2:{
                return new MangoJuice();
            }
        }
        return null;
    }
}
