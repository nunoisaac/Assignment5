public class NamedBox extends Box
{
    public NamedBox()
        {
        super(10,10,50,30);
        name = "Jane";
        }
    public NamedBox(int top, int left, int bottom, int right, String tname){
        super(top, left,bottom,right);
        name = tname;
        }

    public void changeName(String newName)
        {
        name=newName;
        }

    public void grow(int percentage)
        {

            growth = percentage;

        //int width = right-left;
        //int height = bottom -top;
        //int area=width*height;
        //int new area=(width*height)+((width*percent)*(height*percent));
        //
        }
    public void rotate(int degree)
        {
        degreesR=degree;
        }
    public String toString() {
        return super .toString() +", "+name+", degrees rotated: " +degreesR+", Growth percentage:"+growth ;
    }


    protected String name;
    protected int degreesR;
    protected int growth;
}
