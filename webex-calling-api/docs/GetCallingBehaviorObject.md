

# GetCallingBehaviorObject


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**behaviorType** | [**BehaviorTypeEnum**](#BehaviorTypeEnum) | The current Calling Behavior setting for the person. If &#x60;null&#x60;, the effective Calling Behavior will be the Organization&#39;s current default. |  |
|**effectiveBehaviorType** | [**EffectiveBehaviorTypeEnum**](#EffectiveBehaviorTypeEnum) | The effective Calling Behavior setting for the person, will be the organization&#39;s default Calling Behavior if the user&#39;s &#x60;behaviorType&#x60; is set to &#x60;null&#x60;. |  |
|**profileId** | **String** | The UC Manager Profile ID. |  |



## Enum: BehaviorTypeEnum

| Name | Value |
|---- | -----|
| NATIVE_WEBEX_TEAMS_CALLING | &quot;NATIVE_WEBEX_TEAMS_CALLING&quot; |
| CALL_WITH_APP_REGISTERED_FOR_CISCOTEL | &quot;CALL_WITH_APP_REGISTERED_FOR_CISCOTEL&quot; |
| CALL_WITH_APP_REGISTERED_FOR_TEL | &quot;CALL_WITH_APP_REGISTERED_FOR_TEL&quot; |
| CALL_WITH_APP_REGISTERED_FOR_WEBEXCALLTEL | &quot;CALL_WITH_APP_REGISTERED_FOR_WEBEXCALLTEL&quot; |
| NATIVE_SIP_CALL_TO_UCM | &quot;NATIVE_SIP_CALL_TO_UCM&quot; |
| NULL | &quot;null&quot; |



## Enum: EffectiveBehaviorTypeEnum

| Name | Value |
|---- | -----|
| NATIVE_WEBEX_TEAMS_CALLING | &quot;NATIVE_WEBEX_TEAMS_CALLING&quot; |
| CALL_WITH_APP_REGISTERED_FOR_CISCOTEL | &quot;CALL_WITH_APP_REGISTERED_FOR_CISCOTEL&quot; |
| CALL_WITH_APP_REGISTERED_FOR_TEL | &quot;CALL_WITH_APP_REGISTERED_FOR_TEL&quot; |
| CALL_WITH_APP_REGISTERED_FOR_WEBEXCALLTEL | &quot;CALL_WITH_APP_REGISTERED_FOR_WEBEXCALLTEL&quot; |
| NATIVE_SIP_CALL_TO_UCM | &quot;NATIVE_SIP_CALL_TO_UCM&quot; |



