package com.ds.metrocabs.repository.paymentmodelrepository;

import java.util.List;

import com.ds.metrocabs.model.payment.DemandDraft;

public interface DemandDraftDao {
public int save(final DemandDraft demanddraft) throws Exception;
public boolean update(final DemandDraft demanddraft) throws Exception;
public boolean delete(final DemandDraft demanddraft) throws Exception;
//as p.k. is String type
public DemandDraft find(final String id) throws Exception;
public List<DemandDraft> findAll() throws Exception;
}
