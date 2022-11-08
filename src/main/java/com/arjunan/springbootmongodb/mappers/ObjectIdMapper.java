package com.arjunan.springbootmongodb.mappers;

import org.bson.types.ObjectId;
import org.mapstruct.Mapper;
import org.springframework.util.StringUtils;

@Mapper
public class ObjectIdMapper {

    public ObjectId stringToObjectId(String id){
        if (id != null  && !StringUtils.isEmpty(id)) {
            return new ObjectId(id);
        }else {
            return null;
        }
    }

    public String objectIdToString(ObjectId objectId){
        return objectId.toHexString();
    }
}
