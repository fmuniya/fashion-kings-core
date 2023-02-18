import { useContext } from "react";
import SignInForm from "../../components/directory/sign-in-form/sign-in-form.component";
import SignUpForm from "../../components/directory/sign-up-form/sign-up-form.component";
import { CustomerContext } from "../../context/customer.contexts";
import "./authentication.styles.scss";

const Authentication = () => {
   
    const { currentCustomer } = useContext(CustomerContext);
    return(
        <div className="authentication-container">
            {
                currentCustomer? 
                    <h1>You are logged in as {currentCustomer.email}</h1> :             
                    <>
                        <SignInForm />
                        <SignUpForm />
                    </>
            }
        </div>
    )

}

export default Authentication;