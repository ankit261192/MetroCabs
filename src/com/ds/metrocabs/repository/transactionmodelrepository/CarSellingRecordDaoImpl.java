package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ds.metrocabs.model.transaction.CarSellingRecord;
@Repository
public class CarSellingRecordDaoImpl implements CarSellingRecordDao {
@Autowired
private HibernateTemplate ht; 

	@Override
	public int save(CarSellingRecord carsellingrecord) throws Exception {
		
		return (Integer)ht.save(carsellingrecord);
	}

	@Override
	public boolean update(CarSellingRecord carsellingrecord) throws Exception {
		ht.update(carsellingrecord);
		return true;
	}

	@Override
	public boolean delete(CarSellingRecord carsellingrecord) throws Exception {
		ht.delete(carsellingrecord);
		return true;
	}

	@Override
	public CarSellingRecord find(int id) throws Exception {
		
		return (CarSellingRecord)ht.get(CarSellingRecord.class, id);
	}

	@Override
	public List<CarSellingRecord> findAll() throws Exception {
		List<CarSellingRecord> list=ht.find("from CarSellingRecord");
		return list;
	}

}
