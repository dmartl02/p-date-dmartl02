package es.unileon.prg.Date;
import java.util.*;
public class Date {

	public static void main(String args[]) {

		int day;
		int month;
		int year;
	
	Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca un día: ");
		day = entrada.nextInt();
		System.out.println("Introduzca un mes: ");
		month = entrada.nextInt();
		System.out.println("Introduzca un año: ");
		year = entrada.nextInt();

/*
		public int getDay(){
			return day;
		} public int getMonth() {
			return month;
		} public int getYear() {
			return year;
		}

		public void setDay(int dia) {
			if(day>0) day=dia;
		} public void setMonth(int mes) {
			if(month>0) month=mes;
		} public void setYear(int anio) {
			if(year>0) year=anio;
		}

		public Date(int _day,int _month, int _year) {
		day=_day;
		month=_month;
		year=_year;
		}

//Método isSame
			boolean isSameDay(Date another){
				if(_day==another.getDay()){
					return true;
				} else return false;
			}
			boolean isSameMonth(Date another){
				if(_month==another.getMonth()){
					return true;
				} else return false;
			}
			boolean isSameYear(Date another){
				if(_year==another.getYear()){
					return true;
				} else return false;
			}
			*/


//Determinar día, mes y año
			if(month==1){
				System.out.println("Enero");
			}
			if(month==2){
				System.out.println("Febrero");
			}
			if(month==3){
				System.out.println("Marzo");
			}
			if(month==4){
				System.out.println("Abril");
			}
			if(month==5){
				System.out.println("Mayo");
			}
			if(month==6){
				System.out.println("Junio");
			}
			if(month==7){
				System.out.println("Julio");
			}
			if(month==8){
				System.out.println("Agosto");
			}
			if(month==9){
				System.out.println("Septiembre");
			}
			if(month==10){
				System.out.println("Octubre");
			}
			if(month==11){
				System.out.println("Noviembre");
			}
			if(month==12){
				System.out.println("Diciembre");
			}
		
		
		if(month==1 || month ==3 || month==5 || month==7 || month ==8 || month==10 || month==12) {
			if(day>31 || day<1){
				System.out.println("El número no es válido");
			}
		} if(month==4 || month==6 || month==9 || month==11) {
			if(day>30 || day<1){
				System.out.println("El número no es válido");
			}
		} if(month==2) {
			if(day>28 || day<1){
				System.out.println("El número no es válido");
			}
		}

		//Determinar las estaciones
		String estacion = "";
		switch (month) {
			case 1:
			case 2:
			case 3:
				estacion = "Invierno";
			break;
			case 4:
			case 5:
			case 6:
				estacion = "Primavera";
			break;
			case 7: 
			case 8:
			case 9:
				estacion = "Verano";
			break;
			case 10: 
			case 11:
			case 12:
				estacion = "Otoño";
			break;
		}
		System.out.println("La estación es: " +estacion);

//Meses hasta el final del año;
		System.out.println("Meses para acabar el año:");
		System.out.println(12-month);

//Días hasta el final del mes
		if(month==1 || month ==3 || month==5 || month==7 || month ==8 || month==10 || month==12) {
			System.out.println("Días hasta final de mes:"); 
			System.out.println(31-day);
		} if(month==4 || month==6 || month==9 || month==11) {
			System.out.println("Días hasta final de mes:");
			System.out.println(30-day);
		} if(month==2) {
			System.out.println("Días hasta final de mes:");
			System.out.println(28-day);
		}

//Meses con el mismo número de días
		String meses = "";
		int dias = 0;
		System.out.println("Los meses con el mismo número de días son:");
			switch(month) {
				case 1: System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
					break;
				case 2: System.out.println("Febrero");
					break;
				case 3: System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
					break;
				case 4: System.out.println("Abril, Junio, Septiembre y Noviembre");
					break;
				case 5: System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
					break;
				case 6: System.out.println("Abril, Junio, Septiembre y Noviembre");
					break;
				case 7: System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
					break;
				case 8: System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
					break;
				case 9: System.out.println("Abril, Junio, Septiembre y Noviembre");
					break;
				case 10: System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
					break;
				case 11: System.out.println("Abril, Junio, Septiembre y Noviembre");
					break;
				case 12: System.out.println("Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
					break;
			}
//Días desde el principio del año hasta la fecha
		int ndias = 0;
		if(month==1){
			ndias=day;
		} if(month==2){
			ndias=day+31;
		} if(month==3){
			ndias=day+59;
		} if(month==4){
			ndias=day+90;
		} if(month==5){
			ndias=day+120;		
		} if(month==6){
			ndias=day+151;
		} if(month==7){
			ndias=day+181;
		} if(month==8){
			ndias=day+212;
		} if(month==9){
			ndias=day+243;
		} if(month==10){
			ndias=day+273;
		} if(month==11) {
			ndias=day+304;
		} if(month==12){
			ndias=day+334;
		} 
		System.out.println("El número de días son:");
		System.out.println(ndias);

/*Generando fecha aleatoria...
		int rday = ((int) Math.random()*365);
		int rmonth = ((int) Math.random()*12);
		int ryear = ((int) Math.random());
		while((rday=day) && (rmonth=month) && (ryear=year)) System.out.println("Misma fecha");
		*/
	}
}