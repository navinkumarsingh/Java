package ex12_Polymorphism;

//Constructor Overloading Example
public class Ex2_Box {
    double width, height, depth;

    Ex2_Box()                              //1
    {
       /*
       width  =0;
       height =0;
       depth  =0;
       */
        width=height=depth=0;
    }

   Ex2_Box(double w, double h, double d)   //2
    {
        width=w;
        height=h;
        depth=d;
    }

    Ex2_Box(double len)
    {
        width=height=depth=len;
    }

    double volume()
    {
        return (width*height*depth);
    }
}
