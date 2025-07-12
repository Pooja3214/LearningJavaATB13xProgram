package Task_7July;

public interface PlayableInterfacePolymorphism {

   void play();

}

class Guitar implements PlayableInterfacePolymorphism{
   public void play()
    {
        System.out.println(" Playing Guitar");
    }
}

class Piano implements PlayableInterfacePolymorphism
{
    @Override
    public void play() {
        System.out.println("Playing Piano");
    }
    public static void main(String[] args) {

        PlayableInterfacePolymorphism g=new Guitar();
        g.play();

        PlayableInterfacePolymorphism g1=new Piano();
        g1.play();
    }
}
