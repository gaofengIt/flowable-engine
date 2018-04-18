/* Licensed under the Apache License, Version 2.0 (the "License");
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
 */
package org.flowable.app.engine.impl.persistence.entity;

import java.io.Serializable;

import org.flowable.common.engine.impl.persistence.entity.AbstractEntityNoRevision;

public class AppResourceEntityImpl extends AbstractEntityNoRevision implements AppResourceEntity, Serializable {

    private static final long serialVersionUID = 1L;
    
    protected String name;
    protected byte[] bytes;
    protected String deploymentId;
    protected boolean generated;

    public AppResourceEntityImpl() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public String getDeploymentId() {
        return deploymentId;
    }

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    public Object getPersistentState() {
        return AppResourceEntityImpl.class;
    }

    public boolean isGenerated() {
        return false;
    }

    public void setGenerated(boolean generated) {
        this.generated = generated;
    }

    @Override
    public String toString() {
        return "CmmnResourceEntity[id=" + id + ", name=" + name + "]";
    }
    
}