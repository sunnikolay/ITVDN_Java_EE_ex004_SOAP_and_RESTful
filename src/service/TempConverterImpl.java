package service;

import javax.jws.WebService;

@WebService( endpointInterface = "service.TempConverter" )
public class TempConverterImpl implements TempConverter {
	@Override
    public double f2c(double degrees) {
        return degrees * 9 / 5 + 32;
    }

    @Override
    public double c2f(double degrees) {
        return (degrees - 32) * 5 / 9;
    }
    
    @Override
    public String getText( String txt ) {
    	return txt + " 2019-02-13 10:17:23";
    }
}
