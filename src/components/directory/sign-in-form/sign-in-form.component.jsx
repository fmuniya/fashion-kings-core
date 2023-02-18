import React, { useContext, useState } from "react";
import FormInput from "../../form-input/form-input.component";
import "./sign-in-form.styles.scss";
import Button from "../../button/button.component";
import { CustomerContext } from "../../../context/customer.contexts";

const defaultValues = {
    email: '',
    password: '',
    username: ''
}

const customer = { email: '', password: ''}

const SignInForm = () => {

    const[formFeilds, setFormFeilds] = useState(defaultValues);
    const { email, password } = formFeilds;
    
    const { setCurrentCustomer } = useContext(CustomerContext);
    
   

    const handleChange = (event) => {
        const { name, value} = event.target;
        setFormFeilds({...formFeilds, [name] : value});
    }

    const handleSubmit = (event) => {
        event.preventDefault();
        customer.email = email;
        customer.password = password;
        setCurrentCustomer(customer);
    }

    return(
        <div>
            <h2>Already have an account?</h2>
            <span>Sign in with your email and password</span>
            <form onSubmit={handleSubmit}>
                <FormInput 
                    label = "email" 
                    inputOptions = {
                        {
                            type: 'email',
                            required: true,
                            name: 'email',
                            value: email,
                            onChange: handleChange
                        }
                    }
                />

                <FormInput 
                    label = "password" 
                    inputOptions = {
                        {
                            type: 'password',
                            required: true,
                            name: 'password',
                            value: password,
                            onChange: handleChange
                        }
                    }
                />
                <br/>
                <Button buttonType="inverted" type = "submit">Sign In</Button>
                <br />
                <Button buttonType="google" type = "submit">Sign In with google</Button>
            </form>
        </div>
    )
}

export default SignInForm;