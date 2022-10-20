// MAIN Method;
package com.company;
import java.util.Scanner;
// Super Hero
// physical hero
// speedster
// vigilant
public class task {
 public static void main(String[] args) {
 System.out.println("Enter Your Hero");
 System.out.println("1) Physical Hero" + " " + "2) Mage Hero" + " " + "3) Vigilant ");
 Scanner input = new Scanner(System.in);
 int num = input.nextInt();
 switch (num) {
 case 1:
 System.out.println("Press 1\n if you want to use the default information of the your hero. \n 
Press 2\n if you want to add information.");
 int num1 = input.nextInt();
 if (num1 == 1) {
 System.out.println("This is for object 1");
 System.out.print("Enter the Physical Strength of your Hero ");
 int PhysicalStrength = input.nextInt();
 PhysicalHero p = new PhysicalHero(PhysicalStrength);
 System.out.println(p);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest \n 3) Jump \n 4) throw ropes");
 int choose = input.nextInt();
 if (choose == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack ");
 int attack = input.nextInt();
 if (attack == 1) {
 p.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 p.attack(power);
 }
 }
 if (choose == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 p.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 p.rest(power);
 }
 }
 if(choose == 3){
 p.jump(30);
 }
 if(choose == 4){
 p.rope();
 }
 System.out.println("You want to use the Hero Speed Star or not");
 String enter = input.next();
 if (enter.equals("yes")) {
 System.out.println("1) If you want to use the default information for the Speed star hero 
\n 2) you want to add the information to Speed Star hero");
 int press = input.nextInt();
 if (press == 1) {
 System.out.print("Physical Strength : ");
 int ps = input.nextInt();
 System.out.print("Speed ");
 int s = input.nextInt();
 System.out.print("Calories ");
 int c = input.nextInt();
 Speedster s1 = new Speedster(ps, s, c);
 System.out.println("Choose Option");
 System.out.println("1) Attack 2) Rest 3) Move fast 4) Apply Break 5) Speed Tracker 6) 
Calories");
 int choose1 = input.nextInt();
 if (choose1 == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 s1.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 s1.attack(power);
 }
 }
 if (choose1 == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for 
rest");
 int rest = input.nextInt();
 if (rest == 1) {
 s1.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 s1.rest(power);
 }
 }
 if (choose1 == 3) {
 System.out.print("How much he want to increase the speed : ");
 int s2 = input.nextInt();
 s1.moveFast(s2);
 }
 if (choose1 == 4) {
 System.out.print("How much you want to decrease the speed : ");
 int d = input.nextInt();
 s1.applyBreak(d);
 }
 if (choose1 == 5) {
 System.out.println("Speed Tracker");
 s1.speedTracker();
 }
 if (choose1 == 6) {
 System.out.println("Daily Calories");
 s1.setCalories();
 }
 } else if (press == 2) {
 String HeroName, RealName, Occupation, HeroDescription, Age, CanFly;
 int PS, speed, calories;
 System.out.print("Hero Name");
 HeroName = input.nextLine();
 System.out.print("Real Name");
 RealName = input.nextLine();
 System.out.print("Occupation");
 Occupation = input.nextLine();
 System.out.print("Hero Description");
 HeroDescription = input.nextLine();
 System.out.print("Age");
 Age = input.nextLine();
 System.out.print("Can fly");
 CanFly = input.nextLine();
 System.out.print("Physical Strength");
 PS = input.nextInt();
 System.out.print("Speed : ");
 speed = input.nextInt();
 System.out.print("Daily Calories");
 calories = input.nextInt();
 Speedster s2 = new Speedster(HeroName, RealName, Occupation, HeroDescription, Age, 
CanFly, PS, speed, calories);
 System.out.println(s2);
 System.out.println("Choose Option");
 System.out.println("1) Attack 2) Rest 3) Move fast 4) Apply Break 5) Speed Tracker 6) 
Calories");
 int choose1 = input.nextInt();
 if (choose1 == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 s2.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 s2.attack(power);
 }
 }
 if (choose1 == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for 
rest");
 int rest = input.nextInt();
 if (rest == 1) {
 s2.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 s2.rest(power);
 }
 }
 if (choose1 == 3) {
 System.out.print("How much he want to increase the speed : ");
 int s3 = input.nextInt();
 s2.moveFast(s3);
 }
 if (choose1 == 4) {
 System.out.print("How much you want to decrease the speed : ");
 int d = input.nextInt();
 s2.applyBreak(d);
 }
 if (choose1 == 5) {
 System.out.println("Speed Tracker");
 s2.speedTracker();
 }
 if (choose1 == 6) {
 System.out.println("Daily Calories");
 s2.setCalories();
 }
 }
 }
 // object 2.
 System.out.println("This is for object 2");
 System.out.print("Enter the Physical Strength of your Hero ");
 int Physic = input.nextInt();
 PhysicalHero p1 = new PhysicalHero(Physic);
 System.out.println(p1);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest \n 3) Jump \n 4) throw ropes");
 int choos = input.nextInt();
 if (choos == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack ");
 int attack = input.nextInt();
 if (attack == 1) {
 p1.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 p1.attack(power);
 }
 }
 if (choos == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 p1.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 p1.rest(power);
 }
 }
 if(choos == 3){
 p1.jump(30);
 }
 if(choose == 4){
 p1.rope();
 }
 System.out.println("You want to use the Hero Speed Star or not");
 String enter1 = input.next();
 if (enter1.equals("yes")) {
 System.out.println("1) If you want to use the default information for the Speed star hero 
\n 2) you want to add the information to Speed Star hero");
 int press = input.nextInt();
 if (press == 1) {
 System.out.print("Physical Strength : ");
 int ps = input.nextInt();
 System.out.print("Speed ");
 int s = input.nextInt();
 System.out.print("Calories ");
 int c = input.nextInt();
 Speedster s1 = new Speedster(ps, s, c);
 System.out.println("Choose Option");
 System.out.println("1) Attack 2) Rest 3) Move fast 4) Apply Break 5) Speed Tracker 6) 
Calories");
 int choose1 = input.nextInt();
 if (choose1 == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 s1.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 s1.attack(power);
 }
 }
 if (choose1 == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for 
rest");
 int rest = input.nextInt();
 if (rest == 1) {
 s1.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 s1.rest(power);
 }
 }
 if (choose1 == 3) {
 System.out.print("How much he want to increase the speed : ");
 int s2 = input.nextInt();
 s1.moveFast(s2);
 }
 if (choose1 == 4) {
 System.out.print("How much you want to decrease the speed : ");
 int d = input.nextInt();
 s1.applyBreak(d);
 }
 if (choose1 == 5) {
 System.out.println("Speed Tracker");
 s1.speedTracker();
 }
 if (choose1 == 6) {
 System.out.println("Daily Calories");
 s1.setCalories();
 }
 } else if (press == 2) {
 String HeroName, RealName, Occupation, HeroDescription, Age, CanFly;
 int PS, speed, calories;
 System.out.print("Hero Name");
 HeroName = input.nextLine();
 System.out.print("Real Name");
 RealName = input.nextLine();
 System.out.print("Occupation");
 Occupation = input.nextLine();
 System.out.print("Hero Description");
 HeroDescription = input.nextLine();
 System.out.print("Age");
 Age = input.nextLine();
 System.out.print("Can fly");
 CanFly = input.nextLine();
 System.out.print("Physical Strength");
 PS = input.nextInt();
 System.out.print("Speed : ");
 speed = input.nextInt();
 System.out.print("Daily Calories");
 calories = input.nextInt();
 Speedster s2 = new Speedster(HeroName, RealName, Occupation, HeroDescription, Age, 
CanFly, PS, speed, calories);
 System.out.println(s2);
 System.out.println("Choose Option");
 System.out.println("1) Attack 2) Rest 3) Move fast 4) Apply Break 5) Speed Tracker 6) 
Calories");
 int choose1 = input.nextInt();
 if (choose1 == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 s2.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 s2.attack(power);
 }
 }
 if (choose1 == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for 
rest");
 int rest = input.nextInt();
 if (rest == 1) {
 s2.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 s2.rest(power);
 }
 }
 if (choose1 == 3) {
 System.out.print("How much he want to increase the speed : ");
 int s3 = input.nextInt();
 s2.moveFast(s3);
 }
 if (choose1 == 4) {
 System.out.print("How much you want to decrease the speed : ");
 int d = input.nextInt();
 s2.applyBreak(d);
 }
 if (choose1 == 5) {
 System.out.println("Speed Tracker");
 s2.speedTracker();
 }
 if (choose1 == 6) {
 System.out.println("Daily Calories");
 s2.setCalories();
 }
 }
 }
 }
 else if(num1 == 2) {
 System.out.println("This is for object 1");
 String HeroName, RealName, Occupation, HeroDescription, Age, CanFly;
 int P;
 System.out.print("Hero Name");
 HeroName = input.nextLine();
 System.out.print("Real Name");
 RealName = input.nextLine();
 System.out.print("Occupation");
 Occupation = input.nextLine();
 System.out.print("Hero Description");
 HeroDescription = input.nextLine();
 System.out.print("Age");
 Age = input.nextLine();
 System.out.print("Can fly");
 CanFly = input.nextLine();
 System.out.print("Physical Strength");
 P = input.nextInt();
 PhysicalHero p = new 
PhysicalHero(HeroName,RealName,Occupation,HeroDescription,Age,CanFly,P);
 System.out.println(p);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest");
 int choose5 = input.nextInt();
 if (choose5 == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 p.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 p.attack(power);
 }
 }
 if (choose5 == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 p.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 p.rest(power);
 }
 }
 // object 2.
 System.out.println("This is for object 2");
 String HeroName1, RealName1, Occupation1, HeroDescription1, Age1, CanFly1;
 int P1;
 System.out.print("Hero Name");
 HeroName1 = input.nextLine();
 System.out.print("Real Name");
 RealName1 = input.nextLine();
 System.out.print("Occupation");
 Occupation1 = input.nextLine();
 System.out.print("Hero Description");
 HeroDescription1 = input.nextLine();
 System.out.print("Age");
 Age1 = input.nextLine();
 System.out.print("Can fly");
 CanFly1 = input.nextLine();
 System.out.print("Physical Strength");
 P1 = input.nextInt();
 PhysicalHero p1 = new 
PhysicalHero(HeroName1,RealName1,Occupation1,HeroDescription1,Age1,CanFly1,P1);
 System.out.println(p1);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest \n 3) Jump 4) Rope");
 int choos = input.nextInt();
 if (choos == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 p1.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 p1.attack(power);
 }
 }
 if (choos == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 p1.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 p1.rest(power);
 }
 }
 if(choos == 3){
 p1.jump(100);
 }
 if(choos == 4){
 p1.rope();
 }
 }
 else{
 System.out.println("Enter the Correct Number");
 break;
 }
 break;
 case 2:
 System.out.println("Press 1\n if you want to use the default information of the your hero. \n 
Press 2\n if you want to add information.");
 int num2 = input.nextInt();
 if (num2 == 1) {
 System.out.println("This is for object 1");
 System.out.print("Enter the ManaCapacity of your Hero ");
 int ManaCapacity = input.nextInt();
 MageHero m = new MageHero(ManaCapacity);
 System.out.println(m);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest \n 3) Magician Power");
 int choose = input.nextInt();
 if (choose == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 m.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 m.attack(power);
 }
 }
 if (choose == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 m.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 m.rest(power);
 }
 }
 if(choose == 3){
 System.out.println("How much magician power you want to give to your user.");
 int p = input.nextInt();
 m.magicianPower(p);
 }
 // 2nd object of maga
 System.out.println("This is for object 2");
 System.out.print("Enter the ManaCapacity of your Hero ");
 int ManaCapacity1 = input.nextInt();
 MageHero mm = new MageHero(ManaCapacity1);
 System.out.println(mm);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest 3) Magician Power");
 int choos = input.nextInt();
 if (choos == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 mm.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 mm.attack(power);
 }
 }
 if (choos == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 mm.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 mm.rest(power);
 }
 }
 if(choos == 3){
 System.out.println("How much magician power you want to give to the hero");
 int p = input.nextInt();
 mm.magicianPower(p);
 }
 }
 else if(num2 == 2) {
 String HeroName, RealName, Occupation, HeroDescription, Age, CanFly;
 int ManaCapacity;
 System.out.println("Hero Name");
 HeroName = input.nextLine();
 System.out.println("Real Name");
 RealName = input.nextLine();
 System.out.println("Occupation");
 Occupation = input.nextLine();
 System.out.println("Hero Description");
 HeroDescription = input.nextLine();
 System.out.println("Age");
 Age = input.nextLine();
 System.out.println("Can fly");
 CanFly = input.nextLine();
 System.out.println("Mana Capacity");
 ManaCapacity = input.nextInt();
 MageHero m = new 
MageHero(HeroName,RealName,Occupation,HeroDescription,Age,CanFly,ManaCapacity);
 System.out.println(m);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest 3) Magician Power");
 int choose = input.nextInt();
 if (choose == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 m.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 m.attack(power);
 }
 }
 if (choose == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 m.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 m.rest(power);
 }
 }
 if(choose == 3){
 System.out.println("How much magician energy you want to give to your hero");
 int p = input.nextInt();
 m.magicianPower(p);
 }
 // 2nd object.
 String HeroName1, RealName1, Occupation1, HeroDescription1, Age1, CanFly1;
 int ManaCapacity1;
 System.out.println("Hero Name");
 HeroName1 = input.nextLine();
 System.out.println("Real Name");
 RealName1 = input.nextLine();
 System.out.println("Occupation");
 Occupation1 = input.nextLine();
 System.out.println("Hero Description");
 HeroDescription1 = input.nextLine();
 System.out.println("Age");
 Age1 = input.nextLine();
 System.out.println("Can fly");
 CanFly1 = input.nextLine();
 System.out.println("Mana Capacity");
 ManaCapacity1 = input.nextInt();
 MageHero mm = new 
MageHero(HeroName1,RealName1,Occupation1,HeroDescription1,Age1,CanFly1,ManaCapacity1);
 System.out.println(mm);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest 3) Magician Power");
 int choos = input.nextInt();
 if (choos == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 mm.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 mm.attack(power);
 }
 }
 if (choos == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 mm.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 mm.rest(power);
 }
 }
 if(choos == 3){
 System.out.println("How much energy you want to give to your hero");
 int p = input.nextInt();
 mm.magicianPower(p);
 }
 }
 else{
 System.out.println("Enter the Correct Number");
 break;
 }
 break;
 case 3:
 System.out.println("Press 1\n if you want to use the default information of the your hero. \n 
Press 2\n if you want to add information.");
 int num3 = input.nextInt();
 if (num3 == 1) {
 System.out.println("This is for object 1");
 System.out.print("Enter the Physical Strength of your Hero ");
 int physicalStrength = input.nextInt();
 Vigilante v = new Vigilante(physicalStrength);
 System.out.println(v);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest 3) Protect People");
 int choose = input.nextInt();
 if (choose == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 v.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 v.attack(power);
 }
 }
 if (choose == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 v.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 v.rest(power);
 }
 }
 if(choose == 3){
 v.ProtectPeople();
 }
 // object 2;
 System.out.println("This is for object 2");
 System.out.print("Enter the Physical Strength of your Hero ");
 int physical = input.nextInt(); // physical strength.
 Vigilante v1 = new Vigilante(physical);
 System.out.println(v1);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest 3) Protect People");
 int choo = input.nextInt();
 if (choo == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 v1.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 v1.attack(power);
 }
 }
 if (choo == 2) {
 System.out.println("This is for object 1");
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 v1.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 v1.rest(power);
 }
 }
 if(choo == 3){
 v1.ProtectPeople();
 }
 }
 else if(num3 == 2) {
 System.out.println("This is for object 1");
 String HeroName, RealName, Occupation, HeroDescription, Age, CanFly;
 int physicalStrength;
 System.out.println("Hero Name");
 HeroName = input.nextLine();
 System.out.println("Real Name");
 RealName = input.nextLine();
 System.out.println("Occupation");
 Occupation = input.nextLine();
 System.out.println("Hero Description");
 HeroDescription = input.nextLine();
 System.out.println("Age");
 Age = input.nextLine();
 System.out.println("Can Fly");
 CanFly = input.nextLine();
 System.out.println("Physical Strength");
 physicalStrength = input.nextInt();
 Vigilante v = new 
Vigilante(HeroName,RealName,Occupation,HeroDescription,Age,CanFly,physicalStrength);
 System.out.println(v);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest \n Protect People");
 int choose = input.nextInt();
 if (choose == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 v.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 v.attack(power);
 }
 }
 if (choose == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 v.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 v.rest(power);
 }
 }
 if(choose == 3){
 v.ProtectPeople();
 }
 // object 2.
 System.out.println("This is for object 2");
 String HeroName1, RealName1, Occupation1, HeroDescription1, Age1, CanFly1;
 int physicalStrength1;
 System.out.println("Hero Name");
 HeroName1 = input.nextLine();
 System.out.println("Real Name");
 RealName1 = input.nextLine();
 System.out.println("Occupation");
 Occupation1 = input.nextLine();
 System.out.println("Hero Description");
 HeroDescription1 = input.nextLine();
 System.out.println("Age");
 Age1 = input.nextLine();
 System.out.println("Can Fly");
 CanFly1 = input.nextLine();
 System.out.println("Physical Strength");
 physicalStrength1 = input.nextInt();
 Vigilante v1 = new 
Vigilante(HeroName1,RealName1,Occupation1,HeroDescription1,Age1,CanFly1,physicalStrength1);
 System.out.println(v);
 System.out.println("Choose if you want to attack or rest");
 System.out.println("1) Attack \n 2) Rest \n 3) Protect People");
 int choos = input.nextInt();
 if (choos == 1) {
 System.out.println("1) Use the default energy for attack \n 2) Use the Extra energy for 
attack");
 int attack = input.nextInt();
 if (attack == 1) {
 v1.attack();
 }
 if (attack == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 v1.attack(power);
 }
 }
 if (choos == 2) {
 System.out.println("1) Use the default energy for rest \n 2) Use the Extra energy for rest");
 int rest = input.nextInt();
 if (rest == 1) {
 v1.rest();
 }
 if (rest == 2) {
 System.out.println("How many extra energy he wants to give to hero");
 int power = input.nextInt();
 v1.rest(power);
 }
 }
 if(choos == 3){
 v1.ProtectPeople();
 }
 }
 else{
 System.out.println("Enter the Correct Number");
 break;
 }
 break;
 default:
 System.out.println("Enter the correct number");
 }
 }
}
Super Hero;
package com.company;
abstract class SuperHero{
 String HeroName,RealName,Occupation,HeroDescription,Age,Canfly;
 SuperHero(){
 HeroName = "nawab";
 RealName = "ali khan bangash";
 Occupation = "Typing Master";
 HeroDescription = "He is typing master. he is street fighter. he got arfa karim award. he hit six ball 
six sixes. he likes coding and wanted to take competition in competitive coding programs";
 Age = "20";
 Canfly = "sometimes";
 }
 SuperHero(String hn, String rn, String occupation, String hd, String age, String cf){
 HeroName = hn;
 RealName = rn;
 this.Occupation = occupation;
 HeroDescription = hd;
 this.Age = age;
 Canfly = cf;
 }
 abstract void attack();
 abstract void rest();
}
Physical Hero;
package com.company;
class PhysicalHero extends SuperHero{
 int PhyscialStrength ; String attackPower="used the punch";
 PhysicalHero(int ps){
 super();
 PhyscialStrength = ps;
 }
 PhysicalHero(String hn, String rn, String occupation, String hd, String age, String cf,int ps){
 super(hn,rn,occupation,hd,age,cf);
 PhyscialStrength = ps;
 }
 public String toString(){
 return "Hero Name : "+HeroName+"\nReal Name : "+RealName+"\nOccupation : "+Occupation+"\nHero 
Description : "+HeroDescription+"\nAge : "+Age+"\nCan Fly : "+Canfly+"\nPhysical Strength : "+PhyscialStrength 
+ " of normal Human";}
 @Override
 void attack() {
 System.out.println(HeroName+" "+attackPower);
 System.out.println("Physical Strength decreased");
 PhyscialStrength -= 100;
 System.out.println("Physical Strength" + PhyscialStrength);
 }
 void attack(int power){
 System.out.println(HeroName+" "+attackPower);
 System.out.println("Physical Strength decreased");
 PhyscialStrength -= power;
 System.out.println("Physical Strength" + PhyscialStrength);
 }
 @Override
 void rest() {
 PhyscialStrength += 100;
 System.out.println("Physical Strength : "+ PhyscialStrength);
 }
 void rest(int relax){
 PhyscialStrength += relax;
 System.out.println("Physical Strength : "+ PhyscialStrength);
 }
 void jump(int a){
 System.out.println(HeroName+" can jump "+a+" meters high");
 }
 void rope(){
 System.out.println(HeroName + " can throw rope depends upon the Physical Strength");
 }
}
Mage hero program;
package com.company;
class MageHero extends SuperHero{
 int ManaCapacity;
 String attackPower = "cast fire ball";
 MageHero(int mc){
 super();
 ManaCapacity = mc;
 }
 MageHero(String hn, String rn, String occupation, String hd, String age, String cf, int mc){
 super(hn,rn,occupation,hd,age,cf);
 ManaCapacity = mc;
 }
 public String toString(){
 return "Hero Name : "+HeroName+"\nReal Name : "+RealName+"\nOccupation : 
"+Occupation+"\nHero Description : "+HeroDescription+"\nAge : "+Age+"\nCan Fly : 
"+Canfly+"\nPhysical Strength : "+ManaCapacity + " mgika units";}
 @Override
 void attack() {
 System.out.println(HeroName+" "+attackPower);
 System.out.println("Physical Strength decreased");
 ManaCapacity -= 50;
 System.out.println("Physical Strength" + ManaCapacity);
 }
 void attack(int power){
 System.out.println(HeroName+" "+attackPower);
 System.out.println("Physical Strength decreased");
 ManaCapacity -= power;
 System.out.println("Physical Strength" + ManaCapacity);
 }
 @Override
 void rest() {
 ManaCapacity += 100;
 System.out.println("Physical Strength : "+ ManaCapacity);
 }
 void rest(int relax){
 ManaCapacity += relax;
 System.out.println("Physical Strength : "+ ManaCapacity);
 }
 void magicianPower(int a){
 System.out.println("Magician power is increased by : "+(ManaCapacity+a));
 }
}
Vigilant;
package com.company;
class Vigilante extends SuperHero{
 String primaryWeapon = "Vamparange";
 String attackPower = " used the weapon : "+primaryWeapon;
 int physicalstrength;
 Vigilante(int pw){
 super();
 physicalstrength = pw;
 }
 Vigilante(String hn, String rn, String occupation, String hd, String age, String cf, int pw){
 super(hn,rn,occupation,hd,age,cf);
 physicalstrength = pw;
 }
 public String toString(){
 return "Hero Name : "+HeroName+"\nReal Name : "+RealName+"\nOccupation : 
"+Occupation+"\nHero Description : "+HeroDescription+"\nAge : "+Age+"\nCan Fly : 
"+Canfly+"\nPrimary Weapon : "+primaryWeapon;}
 @Override
 void attack() {
 System.out.println(HeroName+" "+attackPower);
 System.out.println("Physical Strength decreased");
 physicalstrength -= 50;
 System.out.println("Physical Strength" + primaryWeapon);
 }
 void attack(int power){
 System.out.println(HeroName+" "+attackPower);
 System.out.println("Physical Strength decreased");
 physicalstrength -= power;
 System.out.println("Physical Strength" + primaryWeapon);
 }
 @Override
 void rest() {
 physicalstrength += 50;
 System.out.println("Physical Strength : "+ physicalstrength);
 }
 void rest(int relax){
 physicalstrength += relax;
 System.out.println("Physical Strength : "+ physicalstrength);
 }
 void ProtectPeople(){
 System.out.println("It protects people when it has full energy and it fights for protection and 
enforcement of law till last blood");
 }
}
Speed Star;
package com.company;
class Speedster extends PhysicalHero{
 int speed,calories;
 Speedster(String hn, String rn, String occupation, String hd, String age, String cf, int ps,int s,int 
calories) {
 super(hn, rn, occupation, hd, age, cf,ps);
 speed = s;
 this.calories = calories;
 }
 Speedster(int ps,int s,int calories){
 super(ps);
 speed = s;
 this.calories = calories;
 }
 public String toString(){
 return "Hero Name : "+HeroName+"\nReal Name : "+RealName+"\nOccupation : 
"+Occupation+"\nHero Description : "+HeroDescription+"\nAge : "+Age+"\nCan Fly : 
"+Canfly+"\nPhysical Strength : "+PhyscialStrength + " of normal Human"+"\n Speed : "+speed+"\n Daily 
Calories : "+calories;}
 void moveFast(int a){
 speed += a;
 if(speed > 1000000){
 System.out.println("Now new speed is : "+1000000);
 }else {
 System.out.println("Now new speed is : " + speed);
 }
 }
 void applyBreak(int b){
 speed -= b;
 if(speed < 1000000/5){
 System.out.println("Now new speed is : "+1000000/5);
 }else {
 System.out.println("Now new speed is : " + speed);
 }
 }
 void speedTracker(){
 System.out.println("MAXIMUM SPEED : "+(1000000)+"\n Minimum Speed : "+(1000000)/5);
 }
 void setCalories(){
 System.out.println("Calories : "+calori
