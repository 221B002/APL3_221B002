public class voice{
    Animal[] animal=new Animal[5];
    void prepareVoice(){
        animal[0]=new cow();
        animal[1]=new lion();
        animal[2]=new tiger();
        animal[3]=new pig();
        animal[4]=new goat();
    }
    
    void hear(){
        for(int i=0;i<5;i++){
            animal[i].makevoice();
        }
    }
}