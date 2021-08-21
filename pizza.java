import java.io.*;
class xyz
{
public static void main(String args[])throws IOException
{
int ch,p,a,ta,amt,tamt,o,b,tb,c,tc,d,td,e,te,f,tf,g,tg,h,th,q;
double vat;
BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
System.out.println("Welcome to*****##S Donalds##*****");
System.out.println("Pizza Mania:1");
System.out.println("Extra Toppings:2");
System.out.println("Speciality Crusts:3");
System.out.println("Burger Pizza:4");
System.out.println("Deserts:5");
System.out.println("Refreshing Beverages:6");
System.out.println();
System.out,println("Press 1 for Pizza Mania");
System.out.println("Press 2 for Extra Toppings");
System.out.println("Press 3 for Speciality Crusts");
System.out.println("Press 4 for Burger Pizza");
System.out.println("Press 5 for Deserts");
System.out.println("Press 6 for Refreshing Beverages");
System.out.println();
System.out.println("Enter the no.");
ch=Integer.parseInt(br.readLine());
switch(ch)
{
case 1:
System.out.println("@@@Welcome to Pizza Mania@@@");
System.out.println("Enter 1 for Veg Pizza and 2 for Non-Veg Pizza");
p=br.readLine();
if(p==1)
{
System.out.println("Pizza Mania\t\t\tSize of pizza\t\t\tPrice in Rs.");
System.out.println("1.Margherita\t\t\tsmall\t\t\t245);
System.out.println("2.Cheese N Corn\t\t\tsmall\t\t\t245");
System.out.prinltn("3.Mexican Green Wave\t\t\tsmall\t\t\t245");
System.out.println("4.Veg Extravaganza\t\t\tsmall\t\t\t245");
System.out.println("5.Double Cheese Margherita\t\t\tsmall\t\t\t245");
System.out.println("6.Peppy Paneer\t\t\tsmall\t\t\t245");
System.out.println("7.Veggie Paradise\t\t\tsmall\t\t\t245");
System.out.println("8.Deluxe Veggie\t\t\tsmall\t\t\t245");
System.out.println("9.Margherita\t\t\tmedium\t\t\t395");
System.out.println("10.Cheese N Corn\t\t\tmedium\t\t\t395");
System.out.println("11.Mexican Green Wave\t\t\tmedum\t\t\t"395);
System.out.println("12.Veg Extravaganza\t\t\tmedium\t\t\t395");
System.out.println("13.Double Cheese Margherita\t\t\tmedium\t\t\t395");
System.out.println("14.Peppy Paneer\t\t\tmedium\t\t\t395");
System.out.println("15.Veggie Paradise\t\t\tmedium\t\t\t395");
System.out.println("16.Deluxe Veggie\t\t\tmedium\t\t\t395");
System.out.println("17.Margherita\t\t\tlarge\t\t\t465");
System.out.println("18.Cheese N Corn\t\t\tlarge\t\t\t465");
System.out.println("19.Mexican Green Wave\t\t\t465");
System.out.println("20.Veg Extravaanza\t\t\tlarge\t\t\t465");
System.out.println("21.Double Cheese Margherita\t\t\tlarge\t\t\t465");
System.out.println("22.Peppy Paneer\t\t\tlarge\t\t\t465");
System.out.println("23.Veggie Paradise\t\t\tlarge\t\t\t465");
System.out.println("24.Deluxe Veggie\t\t\tlarge\t\t\t465");
System.out.println("25.Golden Corn Capsicum\t\t\tsingles\t\t\t169");
System.out.println("26.Cheese N mozoralla\t\t\tsingles\t\t\t189");
System.out.println("27.Spicy Pizza Mania\t\t\tsingles\t\t\t189");
System.out.println();
System.out.println("Choose your pizza mania from above list by entering number.");
a=Integer.parseInt(br.readLine());
System.out.println("Enter the total number of pizza you want:");
ta=Integer.parseInt(br.readLine());
if(a>=1&&a<=8)
amt=ta*245;
if(a>=9&&a<=16)
amt=ta*395;
if(a>=17&&a<=24)
amt=ta*465;
if(a==25)
amt=ta*169;
if(a==26||a==27)
amt=ta*189;
tamt=tamt+amt;
System.out.println("Do you want to place more order?Enter 1 for Yes,Enter 2 for No");
o=Integer.parseInt(br.readLine());
}
if(p==2)
{
System.out.println("Non-Vegeterian Pizza Mania");
System.out.println();
System.out.println("Non-Veg pizzas\t\t\tsize of pizzas\t\t\tprice in Rs.");
System.out.println("1.Cheese & Barbeque Chicken\t\t\tsmall\t\t\t155");
System.out.println("2.Chicken Salami Special\t\t\tsmall\t\t\t155");
System.out.println("3.Hot n Spicy Chicken\t\t\tsmall\t\t\t155");
System.out.println("4.Chicken Mexicana\t\t\tsmall\t\t\t155");
System.out.println("5.Non-veg Supreme\t\t\tsmall\t\t\t155");
System.out.println("6.Cheese & Barbeque Chicken\t\t\tmedium\t\t\t245");
System.out.println("7.Chicken Salami Special\t\t\tmedium\t\t\t245");
System.out.println("8.Hot n Spicy Chicken\t\t\tmedium\t\t\t245");
System.out.println("9.Chicken Mexicana\t\t\tmedium\t\t\t245");
System.out.println("10.Non-Veg Supreme\t\t\tmedium\t\t\t245");
System.out.println("11.Cheese & Barbeque Chicken\t\t\tlarge\t\t\t445");
System.out.println("12.Chicken Salami Special\t\t\tlarge\t\t\t445");
System.out.println("13.Hot n Spicy Chicken\t\t\tlarge\t\t\t445");
System.out.println("14.Chicken Mexicana\t\t\tlarge\t\t\t445");
System.out.println("15.Non-Veg Supreme\t\t\tlarge\t\t\t445");
System.out.println("16.Chunky Chicken\t\t\tsingles\t\t\t189");
System.out.println();
System.out.println("Choose your pizza from the above list by entering number:");
b=Integer.parseInt(br.readLine());
System.out.print("Enter the total number of pizzas you want:");
tb=Integer.parseInt(br.readLine());
if(b>=1&&b<=5)
amt=tb*155;
if(b>=6&&b<=10)
amt=tb*245;
if(b>=11&&b<=15)
amt=tb*445;
if(b==16)
amt=tb*189;
tamt=tamt+amt;
System.ut.println("Do you want to place more order?Enter 1 for yes,enter 2 for no");
o=Integer.parseInt(br.readLine());
}
System.out.println("*********S Donalds*********");
System.out.println("********BILL********");
System.out.println("Total cost=Rs."+tamt);
vat=Math.round(14.5/100.0*tamt);
System.out.println("VAT = 14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be paid=Rs."+(tamt+vat));
System.out.println();
break;
case 2:
System.out.println("@@@Welcome To Extra-toppings@@@");
System.out.println("Enter 1 for veg-pizzas & 2 for Non-Veg Pizzas");
p=Integer.parseInt(br.readLine());
if(p==1)
{
System.out.println("Extra Toppings\t\t\tSize of pizzas\t\t\tPrice of pizzas");
System.out.println("1.Black Olives\t\t\tsmall\t\t\t180");
System.out.println("2.Capsicum\t\t\tsmall\t\t\t180");
System.out.println("3.Crispy onion\t\t\tsmall\t\t\t180");
System.out.println("4.Golden corn\t\t\tsmall\t\t\t180");
System.out.println("5.Fresh Tomato\t\t\tsmall\t\t\t180");
System.out.println("6.Red Paprika\t\t\tsmall\t\t\t180");
System.out.println("7.Black olives\t\t\tmedium\t\t\t280");
System.out.println("8.Capsicum\t\t\tmedium\t\t\t280");
System.out.println("9.Crispy onion\t\t\tmedium\t\t\t280");
System.out.println("10.Golden corn\t\t\tmedium\t\t\t280");
System.out.println("11.Fresh Tomato\t\t\tmedium\t\t\t280");
System.out.println("12.Red Paprika\t\t\tmedium\t\t\t280");
System.out.println("13.Black olives\t\t\tlarge\t\t\t380");
System.out.println("14.Capsicum\t\t\tlarge\t\t\t380");
System.out.println("15.Crispy onion\t\t\tlarge\t\t\t380");
System.out.println("16.Golden corn\t\t\tlarge\t\t\t280");
System.out.println("17.Fresh Tomato\t\t\tlarge\t\t\t280");
System.out.println("18.Red Paprika\t\t\tlarge\t\t\t280");
System.out.println();
System.out.println("Choose your Extra-toppings from above list by entering number.");
c=Integer.parseInt(br.readLine());
System.out.println("Enter the total number of pizza you want:");
tc=Integer.parseInt(br.readLine());
if(c>=1&&c<=6)
amt=tc*180;
if(c>=7&&c<=12)
amt=tc*280;
if(c>=13&&c<=18)
amt=tc*380;
tamt=tamt+amt;
System.out.println("Do you want to place more order?Enter 1 for Yes,enter 2 for No");
o=Integer.parseInt(br.readLine());
}
if(p==2)
{
System.out.println("@@@Welcome To Non-Veg Extra-toppings@@@");
System.out.println("Extra toppings\t\t\tSize of pizzas\t\t\tPrice of pizzas");
System.out.println("1.Barbeque Chicken\t\t\tsmall\t\t\t145");
System.out.println("2.Chunky Chicken\t\t\tsmall\t\t\t145");
System.out.println("3.Hot n Spicy Chicken\t\t\tsmall\t\t\t145");
System.out.println("4.Exotic Chicken Salami\t\t\tsmall\t\t\t145");
System.out.println("5.Barbeque Chicken\t\t\tmediun\t\t\t245");
System.out.println("6.Chunky Chicken\t\t\tmedium\t\t\t245");
System.out.println("7.Hot n Spicy Chicken\t\t\tmedium\t\t\t245");
System.out.println("8.Exotic Chicken Salami\t\t\tmedium\t\t\t245");
System.out.println("9.Barbeque Chicken\t\t\tlarge\t\t\t345");
System.out.println("10.Chunky Chicken\t\t\tlarge\t\t\t345");
System.out.println("11.Hot n Spicy Chicken\t\t\tlarge\t\t\t345");
System.out.println("12.Exotic Chicken Salami\t\t\tlarge\t\t\t345");
System.out.println();
System.out.println("Choose Your Non-Veg Extra Toppings From the list by entering Number:");
d=Integer.parseInt(br.readLine());
System.out.println("Enter the total number of pizza you want:");
td=Integer.parseInt(br.readLine());
if(d>=1&&d<=4)
amt=td*145;
if(d>=5&&d<=8)
amt=td*245;
if(d>=9&&d<=12)
amt=td*345;
tamt=tamt+amt;
System.out.println("Do you want to place more order?Enter 1 for Yes,enter 2 for No");
o=Integer.parseInt(br.readLine());
}
System.out.println("*********S Donalds*********");
System.out.println("********BILL********");
System.out.println("Total cost=Rs."+tamt);
vat=Math.round(14.5/100.0*tamt);
System.out.println("VAT = 14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be paid=Rs."+(tamt+vat));
System.out.println();
break;
case 3:
System.out.println("Welcome To Speciality Crusts");
System.out.println("Speciality Crusts\t\t\tSize of pizzas\t\t\tPrice of pizzas");
System.out.println("1.Fresh Pan\t\t\tsmall\t\t\t100");
System.out.println("2.Cheese Burst\t\t\tsmall\t\t\t100");
System.out.println("3.Wheat Thin Crust\t\t\tsmall\t\t\t120");
System.out.println("4.Quattro Formaggi Burst\t\t\tsmall\t\t\t120");
System.out.println("5.Fresh pan\t\t\tmedium\t\t\t110");
System.out.println("6.Cheese Burst\t\t\tmedium\t\t\t110");
System.out.println("7.Wheat Thin Crust\t\t\tmedium\t\t\t145");
System.out.println("8.Quattro Formaggi Burst\t\t\tmedium\t\t\t145");
System.out.println();
System.out.println("Choose Your Speciality Crusts From the list by entering Number:");
e=Integer.parseInt(br.readLine());
System.out.println("Enter the total number of pizza you want:");
te=Integer.parseInt(br.readLine());
if(e==1||e==2)
amt=te*100;
if(e==3||e==4)
amt=te*120;
if(e==5||e==6)
amt=te*110;
if(e==7||e==8)
amt=te*145;
tamt=tamt+amt;
System.out.println("Do you want to place more order?Enter 1 for Yes,enter 2 for No");
o=Integer.parseInt(br.readLine());
}
System.out.println("*********S Donalds*********");
System.out.println("********BILL********");
System.out.println("Total cost=Rs."+tamt);
vat=Math.round(14.5/100.0*tamt);
System.out.println("VAT = 14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be paid=Rs."+(tamt+vat));
System.out.println();
break;
Case 4:
System.out.println("@@@Welcome To Burger Pizzas@@@");
System.out.println("Burger Pizzas\t\t\tPrice in Rs.");
System.out.println("1.Classic Veg\t\t\t129");
System.out.println("2.Primium Veg\t\t\t119");
System.out.println("3.Classic Non-Veg\t\t\t139");
System.out.println("4.Premium Non-Veg\t\t\t159");
System.out.println();
System.out.println("Choose Your Burger pizzas From the list by entering Number:")
f=Integer.parseInt(br.readLine());
System.out.println("Enter the total number of pizza you want:");
tf=Integer.parseInt(br.readLine());
if(f==1)
amt=tf*129;
if(f==2)
amt=tf*119;
if(f==3)
amt=tf*139;
if(f==4)
amt=tf*159;
tamt=tamt+amt;
System.out.println("Do you want to place more order?Enter 1 for Yes,enter 2 for No");
o=Integer.parseInt(br.readLine());
}
System.out.println("*******S Donalds*******");
System.out.println("********BILL********");
System.out.println("Total cost=Rs."+tamt);
vat=Math.round(14.5/100.0*tamt);
System.out.println("VAT = 14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be paid=Rs."+(tamt+vat));
System.out.println();
break;
Case 5:
System.out.println("@@@Welcome to Deserts@@@");
System.out.println("Deserts\t\t\tprice in Rs.");
System.out.println("1.Choco Lava Cake\t\t\t89");
System.out.println("2.Butterscotch Mousse Cake\t\t\t85");
System.out.println("3.Chocolate Walnut Brownie\t\t\t85");
System.out.println("4.Choco Pizza\t\t\t199");
System.out.println();
System.out.println("Choose Your desert From the list by entering Number:");
g=Integer.parseInt(br.readLine());
System.out.println("Enter the total number of items you want:");
tg=Integer.parseInt(br.readLine());
if(g==1)
amt=tg*89;
if(g==2||g==3)
amt=tg*85;
if(g==4)
amt=tg*199;
tamt=tamt+amt;
System.out.println("Do you want to place more order?Enter 1 for Yes,enter 2 for No");
o=Integer.parseInt(br.readLine());
}
System.out.println("*********S Donalds*********");
System.out.println("********BILL********");
System.out.println("Total cost=Rs."+tamt);
vat=Math.round(14.5/100.0*tamt);
System.out.println("VAT = 14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be paid=Rs."+(tamt+vat));
System.out.println();
break;
case 6:
System.out.println("@@@Welcome To Refreshing Beverages@@@");
System.out.println("Cold Drinks\t\t\tPrice in Rs.");
System.out.println("1.Coke\t\t\t75");
System.out.println("2.Sprite\t\t\t75");
System.out.println("3.Fanta\t\t\t75");
System.out.println("4.Coke Zero\t\t\t75");
System.out.println("5.Diet Coke\t\t\t110");
System.out.println();
System.out.println("Choose Your Drink From the list by entering Number:");
h=Integer.parseInt(br.readLine());
System.out.println("Enter the total number of Cans you want:");
th=Integer.parseInt(br.readLine());
if(h>=1||h<=4)
amt=th*75;
if(h==5)
amt=th*110;
tamt=tamt+amt;
System.out.println("Do you want to place more order?Enter 1 for Yes,enter 2 for No");
}
System.out.println("*********S Donalds*********");
System.out.println("********BILL********");
System.out.println("Total cost=Rs."+tamt);
vat=Math.round(14.5/100.0*tamt);
System.out.println("VAT = 14.5%");
System.out.println("Total VAT=Rs."+vat);
System.out.println("Amount to be paid=Rs."+(tamt+vat));
System.out.println();
break;
default:
System.out.println("You have entered wrong choice!!");
System.out.println("You can enter in the S DONALDS Pizza Shop by executing the program again with the correct choice");
System.out.println("Now, 'Quit' the program");
}
System.out.println("Enter 1 to exit from S DONALDS Pizza Shop!!");
q=Integer.parseInt(br.readLine());
if(q==1)
{
System.out.println("Thanks for coming to S DONALDS Pizza Shop!!!");
System.out.println("Your Pleasure Our Comfort!!!");
System.out.println("Visit Again!!!!");
System.out.println();
}
}
}

