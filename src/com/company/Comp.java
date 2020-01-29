package com.company;

import java.security.KeyStore;

public class Comp {
    class Proc{
        private boolean isStart = false;
        public void start () {
            isStart= true;
        }

        public void shutdown (){
            isStart = false;
        }
    }

    class Ram{
        private boolean isStart = false;
        public void start () {
            isStart= true;
            System.out.println("isStart " + isStart);
        }

        public void shutdown (){
            isStart = false;
            System.out.println("isStart " + isStart);

        }
    }

    Proc i7 = new Proc();
    Ram rr = new Ram();

}
