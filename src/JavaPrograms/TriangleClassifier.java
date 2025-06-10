package JavaPrograms;

public class TriangleClassifier {
    public static void main(String[] args) {

        int s1=2; int s2=2; int s3=2;

        if(s1==s2 && s2==s3)
        {
            System.out.println(" Equilateral Triangle");
        }

        else if ( s1==s2 || s2==s3 )
        {
            System.out.println("Isoceles Trianlge");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }

}
