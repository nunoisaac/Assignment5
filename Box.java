public class Box {
    public Box()
        {
        top=10;
        left=10;
        bottom=50;
        right = 30;
        }
    public Box(int x0, int y0, int x1, int y1)
        {
        top=y0;
        left=x0;
        bottom=y1;
        right=x1;
        }

    public void moveto(int newLeft, int newTop)
    {
    bottom = bottom +(newTop-top);
    right = right+(newLeft-left);
    top = newTop;
    left = newLeft;

    }
    public String toString(){
        return "(" + left+","+ top+"); ("+right+","+bottom+")";
    }


    protected int top;
    protected int left;
    protected int bottom;
    protected int right;


}
