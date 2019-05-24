package lap7;

import java.util.Scanner;

public class Create2 {

	public static void main(String[] args) {
		{
			Create delivery1 = new Create();

            Scanner input = new Scanner(System.in);
            System.out.print("Please enter year : ");
            delivery1.setYear(input.nextInt());

                    while((delivery1.getYear() <= 2001)||(delivery1.getYear() >= 2025))
                    {
                        System.out.println("Year (2010 - 2025) Again");
                        delivery1.setYear(input.nextInt());
                    }

            System.out.print("Please enter a delivery number: ");
            delivery1.setDeliveryNumber(input.nextInt());

                    while((delivery1.getDelivery() <= 0001)||(delivery1.getDelivery() >= 9999))
                    {
                        System.out.println(" between 0001 and 9999 Again ");
                        delivery1.setDeliveryNumber(input.nextInt());
                    }
            System.out.print("Please enter the weight: ");
            delivery1.setWeight(input.nextDouble());

                    while((delivery1.getWeight() <= 0.10)||(delivery1.getWeight() >= 100))
                    {
                        System.out.println("weight is 0.10 pounds and the maxi 100 pounds  Again");
                        delivery1.setWeight(input.nextDouble());
                    }

            System.out.print("Please enter 1 or 2  distance:");
            delivery1.setDistanceCode(input.nextInt());

                    while((delivery1.getDistanceCode() == 1) && (delivery1.getDistanceCode() == 2))
                    {
                        System.out.println("1 or 2  distance Again ");
                        delivery1.setDistanceCode(input.nextInt());
                    }

            String n = Integer.toString(delivery1.getDelivery());
            String y = Integer.toString(delivery1.getYear());

            String trackingNumber = n + y;
            System.out.println(delivery1.getDistanceCode() + " " 
            + trackingNumber + " " + delivery1.getWeight() + " ");

    }

}

	}


