package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.transaction.CarForSaleRecord;
@Repository
public class CarForSaleRecordDaoImpl implements CarForSaleRecordDao {
@Autowired
private HibernateTemplate ht;
	@Override
	public int save(CarForSaleRecord carforsalerecord) throws Exception {
		
		return (Integer)ht.save(carforsalerecord);
	}

	@Override
	public boolean update(CarForSaleRecord carforsalerecord) throws Exception {
		ht.update(carforsalerecord);
		return true;
	}

	@Override
	public boolean delete(CarForSaleRecord carforsalerecord) throws Exception {
		ht.delete(carforsalerecord);
		return true;
	}

	@Override
	public CarForSaleRecord find(int id) throws Exception {
		
		return (CarForSaleRecord)ht.get(CarForSaleRecord.class, id);
	}

	@Override
	public List<CarForSaleRecord> findAll() throws Exception {
		List<CarForSaleRecord> list=ht.find("from CarForSaleRecord");
		return null;
	}

}
