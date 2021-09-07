String seatname;
public void selectedSeat(String blockname)
{
	--count;
	seatno[count]=blockname;
	for(int i=person;i>-1;i--)
	{
		seatname.append(seatno[i]);
	}
	price.setText(seatname);
}
public void unselectedSeat(String blockname)
{
	for(int i=person;i>-1;i--)
	{
		if(seatno[i]==blockname)
		{
			for(int j=--i;j>-1;j--)
			{
				seatno[i]=seatno[j];
				--i;
			}
		}
	}
	++count;
	for(int i=person;i>-1;i--)
	{
		seatname.append(seatno[i]);
	}
	price.setText(seatname);
}