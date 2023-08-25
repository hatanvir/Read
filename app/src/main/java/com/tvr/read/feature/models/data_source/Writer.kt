package com.tvr.read.feature.models.data_source

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize
import com.google.gson.annotations.SerializedName

@Parcelize
class Writer(
    @SerializedName("id")
    var id: Int,
    @SerializedName("writer_name")
    var writerName: String? = null,
    @SerializedName("image")
    var image: String? = null,

): Parcelable {
    constructor(): this(0,"")
   /* companion object {

        fun toGroupMemberDTOs(members: List<Member>): List<GroupMemberDTO> {
            val memberDTOs = arrayListOf<GroupMemberDTO>()

            members.forEach {
                it.sex =  if (it.sex=="1") "Male" else "Female"
                it.hhSex =  if (it.hhSex=="1") "Male" else "Female"
                it.id = if(it.id==null) "" else it.id.toString()
                memberDTOs.add(it.toGroupMemberDTO())
            }

            return memberDTOs
        }
    }*/

    /*fun toMemberDTO(): MemberDTO {
        return MemberDTO(uId, if(id==null) "" else id.toString(), name,hhUid, fathersName,nid,mobileNo,district,upazila,sex,age,hhSex,landSize,picture,submittedBy, xml = xml, instanceId = instanceId)
    }*/

}