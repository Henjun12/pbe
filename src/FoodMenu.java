import javax.swing.*;
import java.awt.*;

public class FoodMenu extends JFrame {
    JComboBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8,cb9;
    ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9;
    JLabel lbl1,lbl2,lbl3,lbl4,lbl5,lbl6,lbl7,lbl8,lbl9;
    JLabel ic1,ic2,ic3,ic4,ic5,ic6,ic7,ic8,ic9;

    public FoodMenu(){
//        setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
        setLayout(new GridLayout(8,0));
        setTitle("Food Menu");
        setSize(850,800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        JPanel p4 = new JPanel();
        JPanel p5 = new JPanel();
        JPanel p6 = new JPanel();
        JPanel p7 = new JPanel();
        JPanel p8 = new JPanel();
        JPanel p9 = new JPanel();
        JPanel p10 = new JPanel();
        JPanel p11 = new JPanel();
        JPanel p12 = new JPanel();
        JPanel p13 = new JPanel();
        JPanel p14 = new JPanel();

        ic1 = new JLabel();
        ic2 = new JLabel();
        ic3 = new JLabel();
        ic4 = new JLabel();
        ic5 = new JLabel();
        ic6 = new JLabel();
        ic7 = new JLabel();
        ic8 = new JLabel();
        ic9 = new JLabel();

        ic1.setIcon(img1);
        ic2.setIcon(img1);
        ic3.setIcon(img1);

        JPanel imgPanel1 = new JPanel();
        imgPanel1.add(ic1);
        imgPanel1.add(ic2);
        imgPanel1.add(ic3);
        JPanel imgPanel2 = new JPanel();
        JPanel imgPanel3 = new JPanel();

        JButton btn = new JButton("Place Order");

        JLabel menu = new JLabel("Menu");
        lbl1 = new JLabel("Appetiser Menu");
        lbl2 = new JLabel("Seafood Menu");
        lbl3 = new JLabel("Chicken Menu");
        lbl4 = new JLabel("Fresh Salad Menu");
        lbl5 = new JLabel("Sandwhiches Menu");
        lbl6 = new JLabel("Pasta Menu");
        lbl7 = new JLabel("Beverage Menu");
        lbl8 = new JLabel("Pastries Menu");
        lbl9 = new JLabel("Desserts Menu");

        String cb1String[] = {"Orange-Glazed Meatballs - RM15.00","Chicken Parmesan Slider Bake - RM13.00"};
        String cb2String[] = {"Creamy Cheesy Butter Prawn - RM30.00","Udang Goreng Tumis - RM27.00"};
        String cb3String[] = {"Ayam Masak Cabai Bersantan - RM12.00","Ayam Bawang Nasi Kandar - RM11.00"};
        String cb4String[] = {"Simple Green Salad - RM13.00","Homemade Caesar Salad - RM15.00"};
        String cb5String[] = {"Grilled Cheese Sandwhich - RM8.00","Egg Mayo Sandwhich - RM7.50"};
        String cb6String[] = {"Pasta bake with sausage - RM21.00","Pesto Penne Pasta - RM23.00"};
        String cb7String[] = {"LADY LYNCHBURG SHAKER -RM15.00","CABO RITA SHAKER - RM15.00"};
        String cb8String[] = {"CHOCOLATE CUBE CROISSANT - RM16.00","CHOC CHIP COOKIE - RM12.00"};
        String cb9String[] = {"Chocolate Cake - RM12.00","Brownies & Bar Cookies - RM17.00"};

        cb1 = new JComboBox(cb1String);
        cb2 = new JComboBox(cb2String);
        cb3 = new JComboBox(cb3String);
        cb4 = new JComboBox(cb4String);
        cb5 = new JComboBox(cb5String);
        cb6 = new JComboBox(cb6String);
        cb7 = new JComboBox(cb7String);
        cb8 = new JComboBox(cb8String);
        cb9 = new JComboBox(cb9String);

        p1.add(menu);

        p2.add(lbl1);
        p2.add(cb1);
        p5.add(lbl2);
        p5.add(cb2);
        p6.add(lbl3);
        p6.add(cb3);
        p7.add(p2);
        p7.add(p5);
        p7.add(p6);
        p7.setLayout(new GridLayout(1,3));

        p3.add(lbl4);
        p3.add(cb4);
        p4.add(lbl5);
        p4.add(cb5);
        p8.add(lbl6);
        p8.add(cb6);
        p9.add(p3);
        p9.add(p4);
        p9.add(p8);
        p9.setLayout(new GridLayout(1,3));

        p10.add(lbl7);
        p10.add(cb7);
        p11.add(lbl8);
        p11.add(cb8);
        p12.add(lbl9);
        p12.add(cb9);
        p13.add(p10);
        p13.add(p11);
        p13.add(p12);
        p13.setLayout(new GridLayout(1,3));

        p14.add(btn);

        add(p1);
        add(imgPanel1);
        add(p7);
        add(p9);
        add(p13);
        add(p14);
    }

    public static void main(String[] args) {

        new FoodMenu();
    }
}
