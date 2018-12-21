package dalieOCP.operator.precedenc;

import static java.lang.System.out;
/*
 * Precedence of operators
 * 
 * Postfix Expression++; Expression--
 * Unary ++Expression, --Expression, +expression, -expression, !
 * Multiplication *(multiply), /(divide); %(remainder)
 * Relation <, >, <=, >=
 * Equality ==; !=
 * Logical AND &&
 * Logical OR ||
 * Assignment =; +=; -=; *=; /=; %=
 * 
 * */
class Execute {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i1 = 1, i2 = 2;
		i1++; //PostFix
		i1--; //PostFix
		
		++i1; //Unary
		--i1; //Unary
		out.print(i1);
		i1 += i1; //Unary i1 = i1 + i1
		out.print(i1);
		i1 -= i1; //Unary i1 = i1 - i1
		out.print(i1);
		i1 = -1; // i1 = +/-1 math.sign assign -1 to
		out.print(i1);
		
		
	}
}
