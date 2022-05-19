/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication11.yerel.ve.anonim.innerclass;

/**
 *
 * @author erdem
 */
public class AnonimInnerClass {
    
    canli insan=new canli() {
        @Override
        public void diskila() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void solunumYap() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void uyu() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    kedi boncuk=new kedi() {
        @Override
        void miyavla() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        void tısla() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        void yemekYe() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    
    
    
    interface canli{
    
        void diskila();
        void solunumYap();
        void uyu();
        
    }
    
    abstract class kedi{
        
        abstract void miyavla();
        abstract void tısla();
        abstract void yemekYe();
    
    }
}
