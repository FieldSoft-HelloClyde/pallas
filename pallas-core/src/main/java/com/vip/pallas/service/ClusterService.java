/**
 * Copyright 2019 vip.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.vip.pallas.service;

import java.util.List;

import com.vip.pallas.mybatis.entity.Cluster;
import com.vip.pallas.mybatis.entity.Page;

public interface ClusterService {
	
	void insert(Cluster cluster) throws Exception;

	void update(Cluster cluster);

	Cluster findByName(String clusterId);

	Cluster selectByPrimaryKey(Long id);

	void deleteByClusterId(String clusterId);

	List<Cluster> findAll();

	List<Cluster> findPage(Page<Cluster> page, String clusterId);

	List<Cluster> selectAllPhysicalClusters();

	//根据indexId，得到所绑定集群对应的实际物理集群（如果Index绑定的是逻辑集群，此方法拿到的此逻辑对应的所有物理集群）
	List<Cluster> selectPhysicalClustersByIndexId(Long indexId);

}