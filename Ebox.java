public class Ebox extends NamedBox {
    public Ebox(int t, int l, int b, int r, String Name, int rotation, int grow, boolean vis)
        {
        top = t;
        left = l;
        bottom = b;
        right = r;
        degreesR=rotation;
        growth=grow;
        Visible=vis;
        name=Name;
        }
    public void setValue(boolean value){
        Visible=value;
    }
    public String toString(){
        return super.toString() +" Visible: "+Visible;

    }



    protected boolean Visible;
}
