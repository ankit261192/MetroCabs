package com.ds.metrocabs.repository.transactionmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.transaction.CarSellingRecord;

public interface CarSellingRecordDao {
	public int save(final CarSellingRecord carsellingrecord) throws Exception;
	public boolean update(final CarSellingRecord carsellingrecord) throws Exception;
	public boolean delete(final CarSellingRecord carsellingrecord) throws Exception;
	public CarSellingRecord find(final int id) throws Exception;
	public List<CarSellingRecord> findAll() throws Exception;
}
