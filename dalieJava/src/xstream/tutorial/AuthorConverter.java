package xstream.tutorial;

import com.thoughtworks.xstream.converters.SingleValueConverter;

public class AuthorConverter implements SingleValueConverter {

	@Override
	public Object fromString(String name) {
		return new Author(name);
	}//fromString

	@Override
	public String toString(Object obj) {
		return ((Author)obj).getName();
	}//toString

	@Override
	public boolean canConvert(Class type) {
		return type.equals(Author.class);
	}//canConvert

}//class AuthorConverter
