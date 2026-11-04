/*
 * Ejercicio4.java
 * 
 * Copyright 2026 Matinal <matinal@pc01-aula1.7>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Ejercicio4 {
	
	public static void main (String[] args) {
		final double GravedadConstanteTierra = 6.67e-11;
		double MasaTierra = 5.97e24;
		double MasaLuna = 7.35e22;
		int DistanciaTierraLuna = 384_000_000;
		double MasaSol = 1.99e30;
		long DistanciaTierraSol = 150_000_000_000l;
		
		double FuerzaLuna = (GravedadConstanteTierra * MasaTierra * MasaLuna) / (1.0 * DistanciaTierraLuna * DistanciaTierraLuna);

		double FuerzaSol = (GravedadConstanteTierra * MasaTierra * MasaSol) / (1.0 * DistanciaTierraSol * DistanciaTierraSol);
		
		System.out.println("La fuerza que con la que se atrae la luna y la tierra segun la formula de Newton es igual a " + FuerzaLuna + " N");
		System.out.println("La fuerza que con la que se atrae el sol y la tierra segun la formula de Newton es igual a " + FuerzaSol + " N");

	}
}

