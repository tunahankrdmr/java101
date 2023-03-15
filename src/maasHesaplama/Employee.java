package maasHesaplama;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary>1000){
            return this.salary*0.03;
        }
        return 0.0;
    }

    public double bonus(){
        if(this.workHours>40){
            return (this.workHours-40)*30;
        }
        return 0;
    }

    public double raiseSalary(){
        int tabanTarih=2021;
        if(tabanTarih-this.hireYear>=10 && tabanTarih-this.hireYear<20){
            return this.salary*0.10;
        }else if (tabanTarih-this.hireYear>=20){
            return this.salary*0.15;
        }
        return this.salary*0.05;
    }
    public String toString(){
        return "Adı : "+this.name+"\nMaaşı : "+this.salary+"\nÇalışma saati : "+this.workHours+
                "\nBaşlangıç Yılı : "+this.hireYear+"\nVergi : "+tax()+"\nBonus : "+bonus()+
                "\nMaaş Artışı : "+raiseSalary()+"\nVergi ve Bonuslar ile birlikte maaş : "+
                (this.salary+bonus()-tax())+"\nToplam Maaş : "+
                (this.salary + this.raiseSalary() + this.bonus() - this.tax());
    }

}
