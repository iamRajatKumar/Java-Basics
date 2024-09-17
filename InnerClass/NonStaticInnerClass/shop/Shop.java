package InnerClass.NonStaticInnerClass.shop;

public class Shop {
    Lock lock = new Lock();
    
    public void shopStatus(){
        if(lock.isLocking()){
            System.out.println("Shop is closed");
        }else{
            System.out.println("Shop is Oprn");
        }
    }

    //inner class
    class Lock{
        private boolean locking = true;

        public boolean isLocking() {
            return locking;
        }

        public void setLocking(boolean locking) {
            this.locking = locking;
        }
        
    }
}
