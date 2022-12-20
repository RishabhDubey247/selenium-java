package referloan;

import java.util.Arrays;

import io.opentelemetry.api.internal.StringUtils;

public class product_name {

	public static void main(String[] args) {
		
		String pname = "finzy personal loan";
		
		String[] newline = pname.split(" ");
//		System.out.print(Arrays.toString(newline));
		String final_loan = "";
		for (int i=0; i<=2; i++) {
			//System.out.print(newline[i]);
			String update = newline[i];
			String updated = update.substring(0, 1).toUpperCase()+ update.substring(1).toLowerCase()+" ";
			 final_loan = final_loan +updated;
			
		}
		 System.out.print(final_loan);
	}

}
