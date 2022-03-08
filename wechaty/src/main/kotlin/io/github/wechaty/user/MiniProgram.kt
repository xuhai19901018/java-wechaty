package io.github.wechaty.user

import io.github.wechaty.schemas.MiniProgramPayload

class MiniProgram(var payload: MiniProgramPayload) {

    fun appid():String?{
        return payload.appid
    }

    fun titile():String?{
        return payload.title
    }

    fun pagePath():String?{
        return payload.pagePath
    }

    fun username():String?{
        return payload.username
    }

    fun description():String?{
        return payload.description
    }

    fun thumbUrl():String? {
        return payload.thumbUrl
    }

    fun thumbKey():String?{
        return payload.thumbKey
    }
    
    fun iconUrl():String?{
        return payload.iconUrl
    }
    
    fun shareId():String?{
        return payload.shareId
    }


    companion object{

        fun create():MiniProgram{
            val payload = MiniProgramPayload()
            return MiniProgram(payload);

        }

    }
}